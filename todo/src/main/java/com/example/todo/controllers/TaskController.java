package com.example.todo.controllers;

import com.example.todo.exceptions.WrongPathException;
import com.example.todo.models.Task;
import com.example.todo.repositories.TaskRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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
            @RequestParam(required = false) String person
    ){
        if(person!=null){
            return taskRepository.findAllTasksByPerson(person);
        }
        return taskRepository.findAllTasks();
    };
    @GetMapping("/task/{id}")

    public Task findTask( @PathVariable int id
    ){
        return taskRepository.findTask(id);
    };
}
