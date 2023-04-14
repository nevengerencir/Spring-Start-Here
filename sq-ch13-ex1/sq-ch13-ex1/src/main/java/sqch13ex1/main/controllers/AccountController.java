package sqch13ex1.main.controllers;

import org.springframework.web.bind.annotation.*;
import sqch13ex1.main.models.Account;
import sqch13ex1.main.models.TransferRequest;
import sqch13ex1.main.repository.AccountRepository;
import sqch13ex1.main.service.TransferService;

import java.util.List;

@RestController
public class AccountController {
    private final AccountRepository repository;
    private final TransferService service;

    public AccountController(AccountRepository repository, TransferService service) {
        this.repository = repository;
        this.service = service;
    }

    @GetMapping("/account/{id}")

    public Account getAccountById(@PathVariable long id) {
        return repository.findAccountById(id);
    }
@GetMapping("/account")
    public List<Account> getAllAccounts() {
        return repository.findAllFromAccount();
    }
    @PostMapping("account/transfer")
    public void transferMoney(@RequestBody TransferRequest request){
        service.transferMoney(request.getSenderId(), request.getReceiverId(),request.getAmount());
    }
}
