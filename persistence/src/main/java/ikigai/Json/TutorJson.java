package ikigai.Json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ikigai.entity.Tutor;
import lombok.*;

@JsonPropertyOrder({
        "first_name",
        "last_name",
        "email",
        "password",
})
@Builder
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class TutorJson {
    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("email")
    private String email;

    @JsonProperty("password")
    private String password;

    public Tutor tutorFromJson() {
        return Tutor.builder()
                .firstName(this.firstName)
                .lastName(this.lastName)
                .email(this.email)
                .password(this.password)
                .build();
    }
}
