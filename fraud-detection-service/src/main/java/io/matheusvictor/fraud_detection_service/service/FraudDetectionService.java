package io.matheusvictor.fraud_detection_service.service;

import io.matheusvictor.fraud_detection_service.entity.LoanStatus;

public interface FraudDetectionService {
    LoanStatus checkForFraud(int customerId);
}
