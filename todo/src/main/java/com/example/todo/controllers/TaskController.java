package com.example.todo.controllers;

import com.example.todo.exceptions.WrongPathException;
import com.example.todo.models.Task;
import com.example.todo.repositories.TaskRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {
    final TaskRepository taskRepository;

    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping("/tasks")
    public List<Task> findAllTasks(
            @RequestParam(required = false) String person,
            @RequestParam(required = false) String completed
    ) {
        if (completed != null && person != null) {

            return taskRepository.findAllTasksByPersonAndCompleted(person, completed);
        }
        if (completed != null) {

            return taskRepository.findAllTaskByCompleted(completed);
        }
        if (person != null) {

            return taskRepository.findAllTasksByPerson(person);
        }
        return taskRepository.findAllTasks();
    }

    ;

    @GetMapping("/task/{id}")

    public Task findTask(@PathVariable int id
    ) {
        return taskRepository.findTask(id);
    }

    @PatchMapping("/task/{id}")
    public Task updateTaskByCompleted(@PathVariable int id, @RequestParam String completed){
        taskRepository.UpdateTaskCompletedColumn(completed,id);
        return findTask(id);
    }
}
