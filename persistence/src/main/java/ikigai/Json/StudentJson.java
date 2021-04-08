package ikigai.Json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ikigai.entity.Home;
import ikigai.entity.Student;
import lombok.*;

import java.util.Date;

@JsonPropertyOrder({
        "date_of_birth",
        "first_name",
        "last_name",
        "home_id",
})
@Builder
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class StudentJson {
    @JsonProperty("date_of_birth")
    private Date dateOfBirth;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("home_id")
    private Long homeId;

    public Student studentFromJson(Home homeId) {
        return Student.builder()
                .firstName(this.firstName)
                .lastName(this.lastName)
                .dateOfBirth(this.dateOfBirth)
                .homeId(homeId)
                .build();
    }
}
