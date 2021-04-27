package ikigai.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Date dateOfBirth;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "home_id", referencedColumnName = "id")
    private Home homeId;

    @JoinTable(
            name = "student_tutor",
            joinColumns = @JoinColumn(name = "student_id", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "tutor_id", nullable = false)
    )
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Tutor> tutors;

    public void addTutor(Tutor tutor) {
        if (this.tutors == null) {
            this.tutors = new ArrayList<>();
        }
        this.tutors.add(tutor);
    }
}
