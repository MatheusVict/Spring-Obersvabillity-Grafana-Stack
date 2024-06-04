package io.matheusvictor.loan_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Loan {
    @Id
    private Long id;
    private String loanId;
    private String customerName;
    private int customerId;
    private BigDecimal amount;
    @Enumerated(EnumType.STRING)
    private LoanStatus loanStatus;
}
