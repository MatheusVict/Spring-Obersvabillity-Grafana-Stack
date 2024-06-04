package io.matheusvictor.loan_service.repository;

import io.matheusvictor.loan_service.entity.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Long> {
}
