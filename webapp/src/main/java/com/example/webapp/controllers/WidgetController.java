package com.example.webapp.controllers;
import com.example.webapp.models.Widget;
import com.example.webapp.services.WidgetService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class WidgetController {

    WidgetService service = new WidgetService();


    @PutMapping("/api/widgets/{wid}")
    public int updateWidget(@PathVariable("wid") String widgetId,
                            @RequestBody Widget widget) {
        return service.updateWidget(widgetId, widget);
    }

    @DeleteMapping("/api/widgets/{wid}")
    public int deleteWidget(@PathVariable("wid") String widgetId) {
        return service.deleteWidget(widgetId);
    }

    @PostMapping("/api/topics/{tid}/widgets")
    public Widget createWidget(@PathVariable("tid") String tid,
                               @RequestBody Widget widget) {
        return service.createWidget(tid,widget);
    }

    @GetMapping("/api/widgets")
    public List<Widget> findAllWidgets() {
        return service.findAllWidgets();
    }

    @GetMapping("/api/topics/{tid}/widgets")
    public List<Widget> findWidgetsForTopic(@PathVariable("tid") String tid) {
        return service.findWidgetsForTopic(tid);
    }



}