package de.camperapi.repo;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

import de.camperapi.entity.Campsite;

/**
 * @author dominic
 *
 * Class is the Configuration to enable id for json campsite objects
 */
@Configuration
public class CampsiteRepoRestMvcConfiguration extends RepositoryRestMvcConfiguration {

	protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		
		//show ids in json 
        config.exposeIdsFor(Campsite.class);
    }
}
