package com.example.webapp.repositories;

import com.example.webapp.models.Topic;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface TopicRepository
        extends CrudRepository<Topic, Integer> {

    @Query(value = "SELECT * FROM Topic WHERE Topic.lesson_id=:lessonId", nativeQuery = true)
    public List<Topic> findTopicsForLesson(@Param("lessonId") String lessonId);

    @Query("SELECT topic FROM Topic topic")
    public List<Topic> findAllTopics();

    @Query("SELECT topic FROM Topic topic WHERE topic.id=:topicId")
    public Topic findTopicById(@Param("topicId") int tid);


}