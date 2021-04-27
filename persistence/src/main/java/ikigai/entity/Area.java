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
public class Area {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String area;

    @Column
    private String description;

    @JoinTable(
            name = "dimension_area",
            joinColumns = @JoinColumn(name = "area_id", nullable = false),
            inverseJoinColumns = @JoinColumn(name = "dimension_id", nullable = false)
    )
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Dimension> dimensions;

    public void addDimension(Dimension dimension) {
        if (this.dimensions == null) {
            this.dimensions = new ArrayList<>();
        }
        this.dimensions.add(dimension);
    }

}
