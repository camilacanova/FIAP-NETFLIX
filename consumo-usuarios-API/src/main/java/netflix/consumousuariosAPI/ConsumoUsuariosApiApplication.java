package netflix.consumousuariosAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {
        "netflix.consumousuariosAPI.model"
        })
@EnableJpaRepositories(basePackages = {
        "netflix.consumousuariosAPI.repository"
        })
public class ConsumoUsuariosApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumoUsuariosApiApplication.class, args);
	}

}
