package com.example.webapp.repositories;

import com.example.webapp.models.Widget;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface WidgetRepository
        extends CrudRepository<Widget, Integer> {

    @Query("SELECT widget FROM Widget widget WHERE widget.id=:widgetId")
    public Widget findWidgetById(
            @Param("widgetId") int wid);

    @Query("SELECT widget FROM Widget widget")
    public List<Widget> findAllWidgets();

    // "SELECT * FROM widgets WHERE topic_id=topicId
//    @Query(value = "SELECT * FROM widgets WHERE topic_id=:tid", nativeQuery = true)
    //@Query("select widget from Widget widget where widget.topic_id=:tid")
    @Query(value = "SELECT * FROM widget WHERE topic_id=:tid",
            nativeQuery = true)
    public List<Widget> findWidgetsForTopic(
            @Param("tid") int topicId);
}