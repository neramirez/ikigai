package ikigai.entity;

import lombok.*;
import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Membership {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String paymentRange;

    @Column
    private String paymentValue;

    @Column
    private Long allowedStudents;

    @Column
    private Boolean evaluatorIncluded;

    @Column
    private Boolean currentlyOffered;
}
