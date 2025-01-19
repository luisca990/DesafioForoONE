package com.desafioforo.DesafioForo.controller;


import com.desafioforo.DesafioForo.domain.topic.TopicRequest;
import com.desafioforo.DesafioForo.domain.topic.TopicResponse;
import com.desafioforo.DesafioForo.service.TopicService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/topics")
public class TopicController {

    private final TopicService service;

    public TopicController(TopicService service) {
        this.service = service;
    }

    @GetMapping
    public List<TopicResponse> getAllTopics() {
        return service.getAllTopics();
    }

    @GetMapping("/{id}")
    public TopicResponse getTopicById(@PathVariable Long id) {
        return service.getTopicById(id);
    }

    @PostMapping
    public ResponseEntity<TopicResponse> createTopic(@Valid @RequestBody TopicRequest request) {
        return ResponseEntity.ok(service.createTopic(request));
    }

    @PutMapping("/{id}")
    public TopicResponse updateTopic(@PathVariable Long id, @Valid @RequestBody TopicRequest request) {
        return service.updateTopic(id, request);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTopic(@PathVariable Long id) {
        service.deleteTopic(id);
        return ResponseEntity.noContent().build();
    }
}
