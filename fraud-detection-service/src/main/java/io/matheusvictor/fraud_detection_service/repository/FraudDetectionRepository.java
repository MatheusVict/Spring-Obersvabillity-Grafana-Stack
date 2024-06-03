package io.matheusvictor.fraud_detection_service.repository;

import io.matheusvictor.fraud_detection_service.entity.FraudRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FraudDetectionRepository extends JpaRepository<FraudRecord, Long> {

    @Query(value = "SELECT CASE WHEN COUNT(*) > 0 THEN TRUE ELSE FALSE END FROM fraud_records WHERE customer_id = ?1", nativeQuery = true)
    boolean existsByCustomerId(int customerId);
}
