package com.exampleTo_Do_ListApplication.To_DoListApplication.service.impl;

import com.exampleTo_Do_ListApplication.To_DoListApplication.dto.TaskDto;
import com.exampleTo_Do_ListApplication.To_DoListApplication.entity.Task;
import com.exampleTo_Do_ListApplication.To_DoListApplication.repository.TaskRepository;
import com.exampleTo_Do_ListApplication.To_DoListApplication.service.TaskService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class TaskServiceImpl implements TaskService {
    private TaskRepository taskRepository;
    private ModelMapper modelMapper;



    @Override
    public TaskDto addTask(TaskDto taskDto) {
        Task task=modelMapper.map(taskDto,Task.class);
        return modelMapper.map(taskRepository.save(task),TaskDto.class);

    }

    @Override
    public List<TaskDto> getAllTasks(){

        return taskRepository.findAll().stream().map(task -> modelMapper.map(task,TaskDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public TaskDto getTask(Long id) {
         Task task=taskRepository.findById(id).get();
        return modelMapper.map(task,TaskDto.class);
    }

    @Override
    public TaskDto updateTask(TaskDto taskDto) {

        Task task=taskRepository.findById(taskDto.getId()).get();
        task.setTitle(taskDto.getTitle());
        task.setDescription(taskDto.getDescription());
        task.setStatus(taskDto.getStatus());
        task.setCreatedAt(taskDto.getCreatedAt());
        task.setUpdatedAt(taskDto.getUpdatedAt());
        return modelMapper.map(taskRepository.save(task),TaskDto.class);
    }

    @Override
    public void deleteTask(Long id) {
taskRepository.deleteById(id);
    }
}
