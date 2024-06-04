package io.matheusvictor.loan_service.service;

import io.matheusvictor.loan_service.dto.LoanDto;

import java.util.List;

public interface LoanService {
    List<LoanDto> listAll();

    String ApplyLoan(LoanDto loanDto);
}
