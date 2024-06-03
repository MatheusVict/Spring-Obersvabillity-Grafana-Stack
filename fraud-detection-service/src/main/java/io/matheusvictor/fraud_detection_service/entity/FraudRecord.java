package io.matheusvictor.fraud_detection_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "fraud_records")
@Getter
@Setter
public class FraudRecord {
    @Id
    private Long id;
    private String fraudRecordId;
    private int customerId;
    private LoanStatus loanStatus;
}
