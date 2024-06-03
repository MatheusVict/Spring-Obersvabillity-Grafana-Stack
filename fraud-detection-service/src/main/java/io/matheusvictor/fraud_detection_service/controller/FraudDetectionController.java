package io.matheusvictor.fraud_detection_service.controller;

import io.matheusvictor.fraud_detection_service.entity.LoanStatus;
import io.matheusvictor.fraud_detection_service.service.FraudDetectionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fraud")
@RequiredArgsConstructor
public class FraudDetectionController {
    private final FraudDetectionService fraudDetectionService;

    @GetMapping("/check/{customerId}")
    public LoanStatus checkForFraud(@PathVariable int customerId) {
        return fraudDetectionService.checkForFraud(customerId);
    }
}
