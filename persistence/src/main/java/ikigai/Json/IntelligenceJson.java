package ikigai.Json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ikigai.entity.Intelligence;
import lombok.*;

@JsonPropertyOrder({
        "intelligence",
        "description",
})
@Builder
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class IntelligenceJson {

    @JsonProperty("intelligence")
    private String intelligence;

    @JsonProperty("description")
    private String description;

    public Intelligence intelligenceFromJson() {
        return Intelligence.builder()
                .intelligence(this.getIntelligence())
                .description(this.getDescription())
                .build();
    }
}
