package ikigai.Json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ikigai.entity.Activity;
import ikigai.entity.Admin;
import lombok.*;

@JsonPropertyOrder({
        "name",
        "last_name",
        "email",
        "role",
        "password"
})
@Builder
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class AdminJson {
    @JsonProperty("name")
    private String name;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("email")
    private String email;

    @JsonProperty("role")
    private String role;

    @JsonProperty("password")
    private String password;


    public Admin adminFromJson(String encoded) {
        return Admin.builder()
                .name(this.name)
                .lastName(this.lastName)
                .email(this.email)
                .role(this.role)
                .password(encoded)
                .build();
    }

    public Admin adminUpdateFromJson(Admin admin) {
        admin.setEmail(this.getEmail() != null ? this.getEmail() : admin.getEmail());
        admin.setLastName(this.getLastName() != null ? this.getLastName() : admin.getLastName());
        admin.setName(this.getName() != null ? this.getName() : admin.getName());
        admin.setRole(this.getRole() != null ? this.getRole() : admin.getRole());
        return admin;
    }
}
