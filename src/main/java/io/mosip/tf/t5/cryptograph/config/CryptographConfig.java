package io.mosip.tf.t5.cryptograph.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class CryptographConfig {

	@Bean
	public Docket dataShareapiBean() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("CryptographController Service").select()
				.apis(RequestHandlerSelectors.basePackage("io.mosip.tf.t5.cryptograph.controller"))
				.paths(PathSelectors.regex("(?!/(error|actuator).*).*")).build();

	}
}
