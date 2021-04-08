package ikigai.Json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ikigai.entity.Area;
import lombok.*;

@JsonPropertyOrder({
        "area",
        "description",
})
@Builder
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AreaJson {

    @JsonProperty("area")
    private String area;

    @JsonProperty("description")
    private String description;

    public Area areaFromJson() {
        return Area.builder()
                .area(this.getArea())
                .description(this.getDescription())
                .build();
    }
}
