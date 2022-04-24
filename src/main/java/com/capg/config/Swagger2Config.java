package com.capg.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class Swagger2Config {

	//build docket build object -- will generate api f
	
	@Bean
	public Docket swaggerConfig()
	{
		/*
		 * return new Docket(DocumentationType.SWAGGER_2) .select()
		 * .paths(PathSelectors.ant("/employee/*"))
		 * 
		 * .build() .apiInfo(new ApiInfo("Aws50-SpringBoot",
		 * "Aws-50 Spring Boot Training", "1.0", null, null, null, null));
		 */
		
		return new Docket (DocumentationType.SWAGGER_2).groupName("Spring Training")
				.apiInfo(apiInfo()).select()
				//.paths(PathSelectors.ant(("/employee.*")))
				.paths(PathSelectors.regex("/employee.*"))
				.build();
				
	}
	
	private ApiInfo apiInfo()
	{
		return new ApiInfoBuilder().title("Employee Management Service")
				.description("Sample documentation generated using SWAGGER 2 for our rest API")
				.termsOfServiceUrl("some URL Name")
				.license("AWS 50 batch license")
				.licenseUrl("Specify licence URL name")
				.version("1.0")
				.build();
	}
	
	
}











