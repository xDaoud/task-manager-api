package com.example.taskmanager.controller;


import com.example.taskmanager.model.Task;
import com.example.taskmanager.repository.TaskRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    private final TaskRepository taskRepository;

    public TaskController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @PostMapping
    public String createTask(@RequestBody Task task) {
        task.setId(UUID.randomUUID().toString());
        taskRepository.save(task);
        return "Task created successfully";
    }

    @GetMapping("/")
    public String hello() {
        return "Hello from Task Manager!";
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @GetMapping("/{id}")
    public Task getTask(@PathVariable String id) {
        return taskRepository.findById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable String id) {
        taskRepository.delete(id);
        return "Task deleted successfully";
    }
}
