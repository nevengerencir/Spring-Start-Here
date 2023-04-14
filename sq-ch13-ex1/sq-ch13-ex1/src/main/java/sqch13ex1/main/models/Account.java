package sqch13ex1.main.models;

import org.springframework.data.annotation.Id;

import java.math.BigDecimal;

public class Account {
    @Id



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    private String name;
    private BigDecimal amount;
}
