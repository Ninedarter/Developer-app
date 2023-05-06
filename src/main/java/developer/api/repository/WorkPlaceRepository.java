package developer.api.repository;

import developer.api.model.WorkPlace;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WorkPlaceRepository extends JpaRepository<WorkPlace,Long> {
}
