package main.sqch11ex1.controller;

import main.sqch11ex1.exceptions.NotEnoughMoneyException;
import main.sqch11ex1.model.Payment;
import main.sqch11ex1.proxy.PaymentsProxy;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
public class PaymentsController {
    private final PaymentsProxy paymentsProxy;

    public PaymentsController(PaymentsProxy paymentsProxy) {
        this.paymentsProxy = paymentsProxy;
    }

    @PostMapping("/payment")
    public Payment createPayment(
            @RequestHeader String requestId,
            @RequestBody Payment payment
    ) {
        if (!requestId.equals("123")){
            throw new NotEnoughMoneyException();
        }
        System.out.println(requestId);
        return paymentsProxy.createPayment(requestId,payment);
    }}
