package com.exampleTo_Do_ListApplication.To_DoListApplication.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="task")
public
class Task {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
  @Column(nullable = false)
  private String title;
  @Column(nullable = false)
  private String description;
  @Column(nullable = false)
  private String status;
  @CreationTimestamp
  @Column(nullable = false)
  private OffsetDateTime createdAt;
  @UpdateTimestamp
  @Column(nullable = false)
  private OffsetDateTime  updatedAt;

}
