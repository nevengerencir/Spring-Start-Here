package sqch13ex1.main.controllers;

import org.springframework.web.bind.annotation.*;
import sqch13ex1.main.interfaces.AccountRepository2;
import sqch13ex1.main.models.Account;
import sqch13ex1.main.models.TransferRequest;
import sqch13ex1.main.repository.AccountRepository;
import sqch13ex1.main.service.TransferService;

import java.util.List;

@RestController
public class AccountController {
    private final AccountRepository repository;
    private final TransferService service;
    private final AccountRepository2 accountRepository2;

    public AccountController(AccountRepository repository, TransferService service, AccountRepository2 accountRepository2) {
        this.repository = repository;
        this.service = service;
        this.accountRepository2 = accountRepository2;
    }

    @GetMapping("/account/{id}")

    public Account getAccountById(@PathVariable long id) {
        return repository.findAccountById(id);
    }
@GetMapping("/account")
    public List<Account> getAllAccounts() {
        return accountRepository2.findAccounts();
    }
    @PostMapping("account/transfer")
    public void transferMoney(@RequestBody TransferRequest request){
        service.transferMoney(request.getSenderId(), request.getReceiverId(),request.getAmount());
    }
}
