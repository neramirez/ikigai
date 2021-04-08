package ikigai.Json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ikigai.entity.Home;
import ikigai.entity.Membership;
import lombok.*;

import java.util.Date;

@JsonPropertyOrder({
        "active",
        "last_payment",
        "next_payment",
        "membership_id",
})
@Builder
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class HomeJson {

    @JsonProperty("active")
    private Boolean active;

    @JsonProperty("last_payment")
    private Date lastPayment;

    @JsonProperty("next_payment")
    private Date nextPayment;

    @JsonProperty("membership_id")
    private Long membershipId;

    public Home homeFromJson(Membership membershipId) {
        return Home.builder()
                .active(this.active)
                .lastPayment(this.lastPayment)
                .nextPayment(this.nextPayment)
                .membershipId(membershipId)
                .build();
    }
}
