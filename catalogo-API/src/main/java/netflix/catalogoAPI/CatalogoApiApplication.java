package netflix.catalogoAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EntityScan(basePackages = {
            "netflix.catalogoAPI.model"
            })
@EnableJpaRepositories(basePackages = {
            "netflix.catalogoAPI.repository"
            })

public class CatalogoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatalogoApiApplication.class, args);
	}

}
