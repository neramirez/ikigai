package ikigai.controller;

import ikigai.Json.TopicJson;
import ikigai.entity.Topic;
import ikigai.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/topic")
public class TopicController {
    @Autowired
    private TopicService topicService;

    @PostMapping("/new")
    public Topic newTopic(@RequestBody TopicJson topicJson) {
        return topicService.newTopic(topicJson);
    }
}
