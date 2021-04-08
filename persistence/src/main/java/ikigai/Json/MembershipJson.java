package ikigai.Json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ikigai.entity.Membership;
import lombok.*;

@JsonPropertyOrder({
        "paymentRange",
        "paymentValue",
        "allowedStudents",
        "evaluatorIncluded",
        "currentlyOffered"
})
@Builder
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter

@JsonInclude(JsonInclude.Include.NON_NULL)
public class MembershipJson {
    @JsonProperty("payment_range")
    private String paymentRange;
    @JsonProperty("payment_value")
    private String paymentValue;
    @JsonProperty("allowed_students")
    private Long allowedStudents;
    @JsonProperty("evaluator_included")
    private Boolean evaluatorIncluded;
    @JsonProperty("currently_offered")
    private Boolean currentlyOffered;

    public Membership membershipFromJson(){
        return Membership.builder()
                .paymentValue(this.getPaymentValue())
                .paymentRange(this.getPaymentRange())
                .evaluatorIncluded(this.getEvaluatorIncluded())
                .currentlyOffered(this.getCurrentlyOffered())
                .allowedStudents(this.getAllowedStudents())
                .build();
    }
}
