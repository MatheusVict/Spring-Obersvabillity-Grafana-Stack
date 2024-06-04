package io.matheusvictor.loan_service.service.impl;

import io.matheusvictor.loan_service.client.FraudDetectionClient;
import io.matheusvictor.loan_service.dto.LoanDto;
import io.matheusvictor.loan_service.entity.Loan;
import io.matheusvictor.loan_service.entity.LoanStatus;
import io.matheusvictor.loan_service.repository.LoanRepository;
import io.matheusvictor.loan_service.service.LoanService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
@Slf4j
public class LoanServiceImpl implements LoanService {

    private final LoanRepository loanRepository;
    private final FraudDetectionClient fraudDetectionClient;

    @Override
    public List<LoanDto> listAll() {
        return this.loanRepository.findAll()
                .stream()
                .map(LoanDto::from)
                .toList();
    }

    @Override
    public String ApplyLoan(LoanDto loanDto) {
        Loan loan = loanDto.toLoan();
        LoanStatus status = fraudDetectionClient.evaluateLoan(loan.getCustomerId());
        log.info("Response from client: {}", status);
        loan.setLoanStatus(status);

        if (status.equals(LoanStatus.APPROVED)) {
            this.loanRepository.save(loan);
            return "Loan application approved";
        }
        return "Sorry! Your loan application has been rejected.";
    }
}
