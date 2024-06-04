package io.matheusvictor.loan_service.client;

import io.matheusvictor.loan_service.entity.LoanStatus;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "fraud-detection-service", url = "localhost:8081/fraud")
public interface FraudDetectionClient {

    @GetMapping("/check/{customerId}")
    LoanStatus evaluateLoan(@PathVariable int customerId);
}
