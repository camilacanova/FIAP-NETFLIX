package netflix.atendimentoAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

@EntityScan(basePackages = {
            "netflix.model"
            })
@EnableJpaRepositories(basePackages = {
            "netflix.repository"
            })

public class AtendimentoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtendimentoApiApplication.class, args);
	}

}
