package main.sqch11payments.controller;

import main.sqch11payments.model.Payment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class PaymentController {

    @PostMapping("/payment")
    public ResponseEntity<Payment> createPayment(
            @RequestHeader String requestId,
            @RequestBody Payment payment){
        payment.setId(requestId);
        return ResponseEntity.status(HttpStatus.ACCEPTED)
                .body(payment);
    }

}
