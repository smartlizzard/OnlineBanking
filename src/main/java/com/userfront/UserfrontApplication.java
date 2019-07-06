package com.userfront;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class UserfrontApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(UserfrontApplication.class, args);
	}

	@Override

	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(UserfrontApplication.class);
	}
	
	


@Configuration
public class WebConfig implements WebMvcConfigurer {      
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
        String[] STATIC_RESOURCE = {"/","classpath:/","classpath:/META-INF/resources/", "classpath:/META-INF/resources/webjars/",
                "classpath:/resources/", "classpath:/static/", "classpath:/public/"};

        if (!registry.hasMappingForPattern("/**")) {
            registry.addResourceHandler("/**").addResourceLocations(STATIC_RESOURCE);
        }
    }
}
}