package com.example.todo.repositories;

import com.example.todo.models.Task;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TaskRepository {
    private final JdbcTemplate jdbc;

    public TaskRepository(JdbcTemplate jdbc) {
        this.jdbc = jdbc;
    }

    public List<Task> findAllTasks(){
        String sql = "SELECT * FROM tasks";

        return jdbc.query(sql, new BeanPropertyRowMapper<>(Task.class));
    }
}
