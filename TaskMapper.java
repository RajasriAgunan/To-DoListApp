package com.exampleTo_Do_ListApplication.To_DoListApplication.mapper;

import com.exampleTo_Do_ListApplication.To_DoListApplication.dto.TaskDto;
import com.exampleTo_Do_ListApplication.To_DoListApplication.entity.Task;
public class TaskMapper {
    public static TaskDto maptoTaskDto(Task task){
        TaskDto taskDto=new TaskDto();
        taskDto.setId(task.getId());
        taskDto.setTitle(task.getTitle());
        taskDto.setDescription(task.getDescription());
        taskDto.setStatus(task.getStatus());
        taskDto.setCreatedAt(task.getCreatedAt());
        taskDto.setUpdatedAt(task.getUpdatedAt());

        return taskDto;
    }
    public static Task maptoTask(TaskDto taskDto){
        Task task=new Task();
        task.setId(taskDto.getId());
        task.setTitle(taskDto.getTitle());
        task.setDescription(taskDto.getDescription());
        task.setStatus(taskDto.getStatus());
        task.setCreatedAt(taskDto.getCreatedAt());
        task.setUpdatedAt(taskDto.getUpdatedAt());
        return task;
    }

}
