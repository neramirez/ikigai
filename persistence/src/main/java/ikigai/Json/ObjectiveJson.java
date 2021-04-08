package ikigai.Json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ikigai.entity.Objective;
import lombok.*;

@JsonPropertyOrder({
        "objective",
        "description",
})
@Builder
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ObjectiveJson {

    @JsonProperty("objective")
    private String objective;

    @JsonProperty("description")
    private String description;

    public Objective objectiveFromJson() {
        return Objective.builder()
                .objective(this.getObjective())
                .description(this.getDescription())
                .build();
    }
}
