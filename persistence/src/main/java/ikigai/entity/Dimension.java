package ikigai.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Dimension {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String dimension;

    @Column
    private String description;

    @JoinTable(
            name = "topic_dimension",
            joinColumns = @JoinColumn(name = "dimension_id", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "topic_id", nullable = false)
    )
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Topic> topics;

    public void addTopic(Topic topic) {
        if (this.topics == null) {
            this.topics = new ArrayList<>();
        }
        this.topics.add(topic);
    }

}
