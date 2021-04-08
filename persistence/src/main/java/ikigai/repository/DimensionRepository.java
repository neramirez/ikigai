package ikigai.repository;

import ikigai.entity.Area;
import ikigai.entity.Dimension;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DimensionRepository extends CrudRepository<Dimension, Long> {
}
