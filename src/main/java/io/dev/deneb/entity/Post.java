package io.dev.deneb.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@ToString
@Entity
@Table(name = "post")
public class Post implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String title;

  private String content;

  private LocalDateTime createdAt;

  public Post(String title, String content) {
    this.title = title;
    this.content = content;
    this.createdAt = LocalDateTime.now();
  }

}
