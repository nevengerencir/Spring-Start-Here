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
        System.out.println(sql);
        return jdbc.query(sql, new BeanPropertyRowMapper<>(Task.class));
    }
    public List<Task> findAllTaskByCompleted(String completed){
        String sql = "SELECT * FROM tasks WHERE completed=?";
        System.out.println(sql);
        return jdbc.query(sql, new BeanPropertyRowMapper<>(Task.class),completed);
    }
    public List<Task> findAllTasksByPerson(String person){
        String sql = "SELECT * FROM tasks WHERE person=?";


        return jdbc.query(sql, new BeanPropertyRowMapper<>(Task.class),person);
    }
    public List<Task> findAllTasksByPersonAndCompleted(String person, String completed){
        String sql = "SELECT * FROM tasks WHERE person=? AND completed=?";


        return jdbc.query(sql, new BeanPropertyRowMapper<>(Task.class),person,completed);
    }

    public Task findTask(int id){
        String sql = "Select * FROM tasks WHERE id = ?";
        return jdbc.queryForObject(sql, new BeanPropertyRowMapper<>(Task.class),id);
    }

    public void UpdateTaskCompletedColumn(String completed, int id){
        String sql ="UPDATE tasks SET completed=? WHERE id = ?";
        jdbc.update(sql,completed,id);
    }
}
