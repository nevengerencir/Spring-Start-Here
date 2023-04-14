package sqch13ex1.main.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sqch13ex1.main.models.Account;
import sqch13ex1.main.repository.AccountRepository;

import java.math.BigDecimal;

@Service
public class TransferService {
    final AccountRepository repository;

    public TransferService(AccountRepository repository) {
        this.repository = repository;
    }

    @Transactional

    public void transferMoney(long idSender, long idReceiver, BigDecimal amount) {
        Account sender = repository.findAccountById(idSender);
        Account receiver = repository.findAccountById(idReceiver);
        BigDecimal senderNewAmount = sender.getAmount().subtract(amount);

        BigDecimal receiverNewAmount = receiver.getAmount().add(amount);
        repository.changeAmount(idSender,senderNewAmount);
        repository.changeAmount(idReceiver,receiverNewAmount);
        if(senderNewAmount.signum() < 0){
            throw new RuntimeException("Not enough money to finish the transaction");

        }
    }
}
