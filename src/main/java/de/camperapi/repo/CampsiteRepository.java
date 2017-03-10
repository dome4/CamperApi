package de.camperapi.repo;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import de.camperapi.entity.Campsite;

@RepositoryRestResource(collectionResourceRel = "campsites", path = "campsites")
public interface CampsiteRepository extends CrudRepository<Campsite, Integer> {

	
	/**
	 * method finds campsite with the number as parameter
	 * 
	 * @param campsiteNo
	 * @return campsite
	 */
	List<Campsite> findByCampsiteNo(@Param("campsiteNo") int campsiteNo);
	
	/**
	 * method returns a list of campsites which are in the param country
	 * 
	 * @param country
	 * @return list of campsites with matching country name
	 */
	List<Campsite> findByCountry(@Param("country") String country);
	
	
	/**
	 * method returns a list of campsites which match the param zip code
	 * 
	 * @param zip
	 * @return list of campsites with matching zip
	 */
	List<Campsite> findByZip(@Param("zip") String zip);
	
	/**
	 * method returns a list of campsites which match the param name
	 * 
	 * @param name
	 * @return list of campsites with matching name
	 */
	List<Campsite> findByName(@Param("name") String name);
	
	/**
	 * method returns a list of campsites which match the param state
	 * 
	 * @param state
	 * @return list of campsites with matching state name
	 */
	List<Campsite> findByState(@Param("state") String state);
	
	/**
	 * method returns a list of campsites which match the param count of stars
	 * 
	 * @param stars
	 * @return list of campsites with matching count of stars
	 */
	List<Campsite> findByStars(@Param("stars") int stars);
	
	@Override
	Campsite save(Campsite campsite);
	
	
	
}
