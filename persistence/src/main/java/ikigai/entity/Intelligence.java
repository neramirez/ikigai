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
public class Intelligence {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String intelligence;

    @Column
    private String description;

    @JoinTable(
            name = "area_intelligence",
            joinColumns = @JoinColumn(name = "intelligence_id", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "area_id", nullable = false)
    )
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Area> areas;

    public void addArea(Area area) {
        if (this.areas == null) {
            this.areas = new ArrayList<>();
        }
        this.areas.add(area);
    }
}
