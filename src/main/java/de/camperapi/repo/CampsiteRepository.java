package de.camperapi.repo;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import de.camperapi.entity.Campsite;

@RepositoryRestResource
public interface CampsiteRepository extends CrudRepository<Campsite, Integer> {

	List<Campsite> findByCampsiteNo(@Param("campsiteNo") int campsiteNo);
	
}
