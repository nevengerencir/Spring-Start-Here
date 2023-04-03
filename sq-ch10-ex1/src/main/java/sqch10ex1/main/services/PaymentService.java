package sqch10ex1.main.services;

import org.springframework.stereotype.Service;
import sqch10ex1.main.exceptions.NotEnoughMoneyException;
import sqch10ex1.main.model.PaymentDetails;
@Service
public class PaymentService {
    public PaymentDetails ProcessPayment(){
        throw new NotEnoughMoneyException();
    }
}
