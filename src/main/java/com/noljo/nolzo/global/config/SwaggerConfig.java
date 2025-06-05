package com.noljo.nolzo.global.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

  @Bean
  public OpenAPI openAPI() {
//    SecurityScheme securityScheme = getSecurityScheme();
//    SecurityRequirement securityRequirement = getSecurityRequireMent();

    return new OpenAPI()
        .info(new Info()
            .title("DeepGround Server API")
            .description("DeepGround APIs")
            .version("1.0.0"));
//        .components(new Components().addSecuritySchemes("bearerAuth", securityScheme))
//        .security(List.of(securityRequirement))
  }

//  private SecurityScheme getSecurityScheme() {
//    return new SecurityScheme().type(SecurityScheme.Type.HTTP).scheme("bearer").bearerFormat("JWT")
//        .in(SecurityScheme.In.HEADER).name("Authorization");
//  }
//
//  private SecurityRequirement getSecurityRequireMent() {
//    return new SecurityRequirement().addList("bearerAuth");
//  }
}