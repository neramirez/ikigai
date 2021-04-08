package ikigai.Json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ikigai.entity.Home;
import ikigai.entity.Relative;
import lombok.*;


@JsonPropertyOrder({
        "first_name",
        "last_name",
        "email",
        "password",
        "home_id",
})
@Builder
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class RelativeJson {
    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("email")
    private String email;

    @JsonProperty("password")
    private String password;

    @JsonProperty("home_id")
    private Long homeId;

    public Relative relativeFromJson(Home homeId) {
        return Relative.builder()
                .firstName(this.firstName)
                .lastName(this.lastName)
                .email(this.email)
                .password(this.password)
                .homeId(homeId)
                .build();
    }
}
