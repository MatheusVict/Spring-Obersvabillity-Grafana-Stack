package io.matheusvictor.loan_service.controller;

import io.matheusvictor.loan_service.dto.LoanDto;
import io.matheusvictor.loan_service.service.LoanService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loan")
@RequiredArgsConstructor
public class LoanController {

    private final LoanService loanService;

    @GetMapping

    public ResponseEntity<List<LoanDto>> listAllLoans() {
        return ResponseEntity.ok(loanService.listAll());
    }

    @PostMapping
    public String applyLoan(@RequestBody LoanDto loanDto) {
        return loanService.ApplyLoan(loanDto);
    }
}
