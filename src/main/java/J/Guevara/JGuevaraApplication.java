package J.Guevara;

import io.swagger.annotations.SwaggerDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@EnableSwagger2
@Configuration
@SpringBootApplication
public class JGuevaraApplication {

	public static void main(String[] args) {
		SpringApplication.run(JGuevaraApplication.class, args);
	}

        @Bean 
        public Docket productApi(){
            return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("J.Guevara")).build();
           
        } 
}
