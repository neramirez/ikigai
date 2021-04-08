package ikigai.repository;

import ikigai.entity.Objective;
import ikigai.entity.Tutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ObjectiveRepository extends CrudRepository<Objective, Long> {
}
