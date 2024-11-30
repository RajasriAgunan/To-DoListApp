package com.exampleTo_Do_ListApplication.To_DoListApplication.service;

import com.exampleTo_Do_ListApplication.To_DoListApplication.dto.TaskDto;

import java.util.List;

public interface TaskService {


    TaskDto addTask(TaskDto taskDto);

    List<TaskDto> getAllTasks();


    TaskDto getTask(Long id);

    TaskDto updateTask(TaskDto taskDto);


    void deleteTask(Long id);

}
