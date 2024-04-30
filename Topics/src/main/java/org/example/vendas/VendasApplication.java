package org.example.vendas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VendasApplication {

//	@Autowired
//	@Qualifier("applicationName")
//	private String applicationName;

	// pegando do application.properties
	@Value("${spring.application.name}")
	private String applicationName2;

	@Cachorro
	private Animal animal;

	@Bean(name= "executar animal")
	public CommandLineRunner executar () {
		return args -> {
			animal.fazerBarulho();
		};
	}

	@GetMapping("/hello")
	public String helloWorld() {
		return applicationName2;
	}

	public static void main(String[] args) {

		SpringApplication.run(VendasApplication.class, args);
	}

}
