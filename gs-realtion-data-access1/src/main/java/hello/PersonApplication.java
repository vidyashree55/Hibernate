package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;

@SpringBootApplication
@EnableAutoConfiguration(/*exclude={DataSourceAutoConfiguration.class}*/)
public class PersonApplication {
	
	/*@Bean
	SampleService sampleService()
	{
		return new SampleService();
	}
*/
	public static void main(String[] args) {
		SpringApplication.run(PersonApplication.class, args);
	}
}