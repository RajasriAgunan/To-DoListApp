package com.exampleTo_Do_ListApplication.To_DoListApplication.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskDto {

    private Long id;
    @NotEmpty(message = "task_title")
    private String title;
    @NotEmpty(message = "description")
    private String description;
    @NotEmpty(message = "status")
    private String status;
    @NotEmpty(message = "date")
    private OffsetDateTime createdAt;
    @NotEmpty(message = "date")
    private OffsetDateTime  updatedAt;

}

