package ikigai.Json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ikigai.entity.Dimension;
import lombok.*;

@JsonPropertyOrder({
        "dimension",
        "description",
})
@Builder
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class DimensionJson {

    @JsonProperty("dimension")
    private String dimension;

    @JsonProperty("description")
    private String description;

    public Dimension dimensionFromJson() {
        return Dimension.builder()
                .dimension(this.getDimension())
                .description(this.getDescription())
                .build();
    }
}
