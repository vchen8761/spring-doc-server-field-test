package com.example.springdocserverfieldtest.configuration;

import io.swagger.v3.oas.models.servers.Server;
import org.springdoc.core.customizers.OpenApiCustomiser;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class OpenApiConfig {
    @Bean
    OpenApiCustomiser openApiCustomiser() {
        return openApi -> {
            openApi.getInfo().version("v1");
            openApi.servers(List.of(new Server().url("").description("My URL")));
        };
    }
}
