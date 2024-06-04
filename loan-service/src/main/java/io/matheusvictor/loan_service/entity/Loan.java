package io.matheusvictor.loan_service.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String loanId;
    private String customerName;
    private int customerId;
    private BigDecimal amount;
    @Enumerated(EnumType.STRING)
    private LoanStatus loanStatus;
}
