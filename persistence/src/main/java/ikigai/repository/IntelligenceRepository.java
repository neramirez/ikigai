package ikigai.repository;

import ikigai.entity.Intelligence;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IntelligenceRepository extends CrudRepository<Intelligence, Long> {
}
