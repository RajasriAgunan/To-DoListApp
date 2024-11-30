package com.exampleTo_Do_ListApplication.To_DoListApplication.controller;

import com.exampleTo_Do_ListApplication.To_DoListApplication.dto.TaskDto;
import com.exampleTo_Do_ListApplication.To_DoListApplication.service.TaskService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/task")
public class TaskController {
    TaskService taskService;
    @PostMapping
    public ResponseEntity<TaskDto> addTask(@RequestBody @Valid TaskDto taskDto) {
        TaskDto savedTask = taskService.addTask(taskDto);
        return new ResponseEntity<>(savedTask, HttpStatus.CREATED);
    }
        @GetMapping
        public ResponseEntity<List<TaskDto>> getAllTasks() {
            List<TaskDto> tasks =taskService.getAllTasks();
            return new ResponseEntity<>(tasks, HttpStatus.OK);
        }

        @GetMapping("{id}")
        public ResponseEntity<TaskDto> getEmployee(@PathVariable("id") Long id) {
            TaskDto taskDto = taskService.getTask(id);
            return new ResponseEntity<>(taskDto, HttpStatus.OK);
        }
        @PutMapping("{id}")
        public ResponseEntity<TaskDto> updateTask(@PathVariable("id") Long id ,
                @RequestBody  @Valid TaskDto taskDto) {
            taskDto.setId(id);
            TaskDto updateTask = taskService.updateTask(taskDto);
            return new ResponseEntity<>(updateTask, HttpStatus.OK);
        }
        @DeleteMapping("{id}")
        public ResponseEntity<String> deleteEmployee(@PathVariable("id") Long id){
            taskService.deleteTask(id);
            return new ResponseEntity<String>("Employee Details Deleted Successfully",HttpStatus.OK);
        }
    }
