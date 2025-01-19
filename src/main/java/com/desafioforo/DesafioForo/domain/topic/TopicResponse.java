package com.desafioforo.DesafioForo.domain.topic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TopicResponse {
    private Long id;
    private String title;
    private String message;
    private LocalDateTime createdAt;
    private Boolean active;

    public TopicResponse(Long id, String title, String message, LocalDateTime createdAt, Boolean active) {
        this.id = id;
        this.title = title;
        this.message = message;
        this.createdAt = createdAt;
        this.active = active;
    }
}