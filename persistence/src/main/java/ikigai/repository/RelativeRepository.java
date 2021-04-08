package ikigai.repository;


import ikigai.entity.Relative;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RelativeRepository extends CrudRepository<Relative, Long> {
}
