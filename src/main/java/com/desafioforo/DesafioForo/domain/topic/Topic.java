package com.desafioforo.DesafioForo.domain.topic;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;




@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String message;

    private LocalDateTime createdAt = LocalDateTime.now();

    private Boolean active = true;

    // Relaciones (por ejemplo, User o Respuestas pueden añadirse aquí)

    public Topic(Long id, String title, String message, LocalDateTime createdAt, Boolean active) {
        this.id = id;
        this.title = title;
        this.message = message;
        this.createdAt = createdAt;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
