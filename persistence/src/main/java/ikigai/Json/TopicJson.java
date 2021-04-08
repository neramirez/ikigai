package ikigai.Json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ikigai.entity.Topic;
import lombok.*;

@JsonPropertyOrder({
        "topic",
        "description",
})
@Builder
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class TopicJson {

    @JsonProperty("topic")
    private String topic;

    @JsonProperty("description")
    private String description;

    public Topic topicFromJson() {
        return Topic.builder()
                .topic(this.getTopic())
                .description(this.getDescription())
                .build();
    }
}
