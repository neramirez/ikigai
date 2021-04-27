package ikigai.Json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ikigai.entity.Membership;
import lombok.*;

@JsonPropertyOrder({
        "name",
        "description",
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
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("name")
    private String name;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("description")
    private String description;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("payment_range")
    private String paymentRange;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("payment_value")
    private String paymentValue;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("allowed_students")
    private Long allowedStudents;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("evaluator_included")
    private Boolean evaluatorIncluded;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("currently_offered")
    private Boolean currentlyOffered;

    public Membership membershipFromJson() {
        return Membership.builder()
                .name(this.getName())
                .description(this.getDescription())
                .paymentValue(this.getPaymentValue())
                .paymentRange(this.getPaymentRange())
                .evaluatorIncluded(this.getEvaluatorIncluded())
                .currentlyOffered(this.getCurrentlyOffered())
                .allowedStudents(this.getAllowedStudents())
                .build();
    }

    public Membership membershipUpdateFromJson(Membership membership) {
        membership.setPaymentValue(this.getPaymentValue() != null ? this.getPaymentValue() : membership.getPaymentValue());
        membership.setName(this.getName() != null ? this.getName() : membership.getName());
        membership.setDescription(this.getDescription() != null ? this.getDescription() : membership.getDescription());
        membership.setPaymentRange(this.getPaymentRange() != null ? this.getPaymentRange() : membership.getPaymentRange());
        membership.setAllowedStudents(this.getAllowedStudents() != null ? this.getAllowedStudents() : membership.getAllowedStudents());
        membership.setEvaluatorIncluded(this.getEvaluatorIncluded() != null ? this.getEvaluatorIncluded() : membership.getEvaluatorIncluded());
        membership.setCurrentlyOffered(this.getCurrentlyOffered() != null ? this.getCurrentlyOffered() : membership.getCurrentlyOffered());
        return membership;
    }

}
