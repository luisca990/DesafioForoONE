package com.desafioforo.DesafioForo.service;

import com.desafioforo.DesafioForo.domain.topic.TopicRequest;
import com.desafioforo.DesafioForo.domain.topic.TopicResponse;
import com.desafioforo.DesafioForo.infra.ResourceNotFoundException;
import com.desafioforo.DesafioForo.domain.topic.Topic;
import com.desafioforo.DesafioForo.domain.topic.TopicRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TopicService {

    private final TopicRepository repository;

    public TopicService(TopicRepository repository) {
        this.repository = repository;
    }

    public List<TopicResponse> getAllTopics() {
        return repository.findAll().stream()
                .map(this::toResponse)
                .collect(Collectors.toList());
    }

    public TopicResponse getTopicById(Long id) {
        Topic topic = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Topic not found with id " + id));
        return toResponse(topic);
    }

    public TopicResponse createTopic(TopicRequest request) {
        Topic topic = new Topic(null, request.getTitle(), request.getMessage(), null, true);
        repository.save(topic);
        return toResponse(topic);
    }

    public TopicResponse updateTopic(Long id, TopicRequest request) {
        Topic topic = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Topic not found with id " + id));

        topic.setTitle(request.getTitle());
        topic.setMessage(request.getMessage());
        repository.save(topic);
        return toResponse(topic);
    }

    public void deleteTopic(Long id) {
        Topic topic = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Topic not found with id " + id));
        topic.setActive(false);
        repository.save(topic);
    }

    private TopicResponse toResponse(Topic topic) {
        return new TopicResponse(topic.getId(), topic.getTitle(), topic.getMessage(), topic.getCreatedAt(), topic.getActive());
    }
}