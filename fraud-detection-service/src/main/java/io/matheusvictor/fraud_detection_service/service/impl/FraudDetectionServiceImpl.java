package io.matheusvictor.fraud_detection_service.service.impl;

import io.matheusvictor.fraud_detection_service.entity.LoanStatus;
import io.matheusvictor.fraud_detection_service.repository.FraudDetectionRepository;
import io.matheusvictor.fraud_detection_service.service.FraudDetectionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FraudDetectionServiceImpl implements FraudDetectionService {

    private final FraudDetectionRepository fraudDetectionRepository;

    @Override
    public LoanStatus checkForFraud(int customerId) {
        return fraudDetectionRepository.existsByCustomerId(customerId) ? LoanStatus.APPROVED : LoanStatus.REJECTED;
    }
}
