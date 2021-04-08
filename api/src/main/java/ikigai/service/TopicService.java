package ikigai.service;

import ikigai.Json.TopicJson;
import ikigai.entity.Topic;
import ikigai.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TopicService {
    @Autowired
    private TopicRepository topicRepository;

    @Transactional
    public Topic newTopic(TopicJson json) {
        return topicRepository.save(json.topicFromJson());
    }
}
