package crm;  

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@RestController
@RequestMapping(value = "/customers")
@EnableSwagger2
public class Application {

	// start Swagger stuff
	// @Autowired
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any()).build();
	}
	// end Swagger stuff

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Customer>> findAll() {
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(new Customer("Sibendu", "Das", new Integer(41), null));
		customers.add(new Customer("John", "Doe", new Integer(30), new Double(10000.50)));

		// events.forEach((ev) -> System.out.println(ev.toString()));
		return new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);
	}

}
