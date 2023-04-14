package sqch13ex1.main.repository;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import sqch13ex1.main.models.Account;

import java.math.BigDecimal;
import java.util.List;

@Repository
public class AccountRepository {
    final private JdbcTemplate jdbc;

    public AccountRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public Account findAccountById(long id) {
        String sql = "SELECT * FROM account WHERE id=?";
        return jdbc.queryForObject(sql, new BeanPropertyRowMapper<>(Account.class), id);
    }

    public List<Account> findAllFromAccount() {
        String sql = "SELECT * FROM account ";
        return jdbc.query(sql, new BeanPropertyRowMapper<>(Account.class));
    }

    public void changeAmount(long id, BigDecimal amount) {
        String sql = "UPDATE account SET amount=? WHERE id=?";
        jdbc.update(sql, amount, id);
    }
}