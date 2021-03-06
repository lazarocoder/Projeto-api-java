package br.com.desafio.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket api() {
		return new Docket(DocumentationType.OAS_30).select()
				.apis(RequestHandlerSelectors.basePackage("br.com.desafio.controllers"))
				.paths(PathSelectors.ant("/api/**"))
				.build()
				.useDefaultResponseMessages(false)
				.apiInfo(metaData());
	}

	private ApiInfo metaData() {
		return new ApiInfoBuilder().title("Api Desafio")
				.description("\" Projeto desafio Spring Boot Swagger \"")
				.version("0.0.1-SNAPSHOT")
				.contact(
						new Contact("Lázaro Daniel", "https://www.linkedin.com/in/lázaro-silva-desenvolvedor", "lazarodaniel80@gmail.com"))
				.build();
	}
	
}