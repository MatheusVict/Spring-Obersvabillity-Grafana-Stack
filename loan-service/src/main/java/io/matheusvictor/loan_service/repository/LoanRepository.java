package io.matheusvictor.loan_service.repository;

import io.matheusvictor.loan_service.entity.Loan;
import io.micrometer.observation.annotation.Observed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Observed
public interface LoanRepository extends JpaRepository<Loan, Long> {
}
