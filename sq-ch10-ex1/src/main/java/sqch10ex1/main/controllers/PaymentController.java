package sqch10ex1.main.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import sqch10ex1.main.model.PaymentDetails;
import sqch10ex1.main.services.PaymentService;

@RestController
public class PaymentController {
   private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    @PostMapping("payment")
    public ResponseEntity<?> makePayment(){
            PaymentDetails paymentDetails = paymentService.ProcessPayment();
            return ResponseEntity.status(HttpStatus.ACCEPTED)
                    .body(paymentDetails);
    }
}
