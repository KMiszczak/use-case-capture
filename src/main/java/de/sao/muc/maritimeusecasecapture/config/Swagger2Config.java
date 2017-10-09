package de.sao.muc.maritimeusecasecapture.config;

import com.google.common.collect.Lists;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.List;

@Configuration
@EnableSwagger2
public class Swagger2Config {



    @Bean
    public Docket api() {


        return new Docket(DocumentationType.SWAGGER_2)
                //.groupName("API Version 1.0")
                .apiInfo(getApiInfo())
                .useDefaultResponseMessages(false)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.ant("/api/**"))
                .build()
                .pathMapping("/");
    }




    private ApiInfo getApiInfo() {
        return new ApiInfoBuilder()
                .title("Maritime Use Case Capture API")
                .description("")
                //.termsOfServiceUrl("http://springfox.io")
                .contact(new Contact("Kevin Miszczak", "", ""))
                .license("")
                .licenseUrl("")
                .version("1.0")
                .build();
    }
}
