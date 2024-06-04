package io.matheusvictor.loan_service.dto;

import io.matheusvictor.loan_service.entity.Loan;
import io.matheusvictor.loan_service.entity.LoanStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
public class LoanDto {
    private String loanId;
    private String customerName;
    private int customerId;
    private BigDecimal amount;
    private LoanStatus loanStatus;

    public static LoanDto from(Loan loan) {
        return new LoanDto(loan.getLoanId(), loan.getCustomerName(), loan.getCustomerId(),
                loan.getAmount(), loan.getLoanStatus());
    }

    public Loan toLoan() {
        return new Loan(null, this.loanId, this.customerName, this.customerId, this.amount, this.loanStatus);
    }
}