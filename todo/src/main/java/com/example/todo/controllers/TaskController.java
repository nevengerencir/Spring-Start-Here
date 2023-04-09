package com.example.todo.controllers;

import com.example.todo.models.Task;
import com.example.todo.repositories.TaskRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {
    final TaskRepository taskRepository;

    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping("/tasks")
    public List<Task> findAllTasks(
    ){
        return taskRepository.findAllTasks();
    };
    @GetMapping("/tasks/{id}")

    public Task findTask( @PathVariable String id
    ){
        return taskRepository.findTask(id);
    };
}
