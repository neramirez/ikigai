package ikigai.Json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ikigai.entity.Activity;
import lombok.*;

@JsonPropertyOrder({
        "published",
        "approval_status",
        "duration",
        "download_url",
})
@Builder
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ActivityJson {
    @JsonProperty("published")
    private Boolean published;

    @JsonProperty("approval_status")
    private String approvalStatus;

    @JsonProperty("duration")
    private String duration;

    @JsonProperty("download_url")
    private String downloadUrl;

    public Activity activityFromJson(){
        return Activity.builder()
                .approvalStatus(this.approvalStatus)
                .downloadUrl(this.downloadUrl)
                .duration(this.duration)
                .published(this.published)
                .build();
    }
}
