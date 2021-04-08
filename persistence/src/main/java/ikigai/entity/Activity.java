package ikigai.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Activity {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Boolean published;

    @Column
    private String approvalStatus;

    @Column
    private String duration;

    @Column
    private String downloadUrl;
}
