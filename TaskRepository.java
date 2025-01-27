package com.exampleTo_Do_ListApplication.To_DoListApplication.repository;

import com.exampleTo_Do_ListApplication.To_DoListApplication.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.Optional;

public interface TaskRepository extends JpaRepository<Task,Long> {

    Optional<Task> findByTitle(String title);


}