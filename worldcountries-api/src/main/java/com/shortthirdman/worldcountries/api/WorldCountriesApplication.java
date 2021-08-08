/*
 * Copyright 2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.shortthirdman.worldcountries.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableScheduling;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

/**
 * @author shortthirdman-org
 *
 */
@SpringBootApplication
@EnableScheduling
public class WorldCountriesApplication {

	@Autowired
	private Environment env;

	public static void main(String[] args) {
		SpringApplication.run(WorldCountriesApplication.class, args);
	}
	
	@Bean
    public OpenAPI customOpenAPI() {
		Contact contact = new Contact()
				.name(env.getProperty("author-name", "Swetank Mohanty"))
				.email(env.getProperty("author-email", "swetank.mohanty@outlook.com"))
				.url(env.getProperty("author-url", "https://www.shortthirdman.com"));
		License license = new License()
				.name("Apache-2.0")
				.url("https://www.apache.org/licenses/LICENSE-2.0");
		Info info = new Info()
				.title(env.getProperty("spring.application.name"))
				.description("WorldCountries - Spring Boot RESTful service using springdoc-openapi and OpenAPI 3.")
				.contact(contact)
				.license(license)
				.version("2.0")
				.termsOfService("https://worldcountries.herokuapp.com/serviceterms");
        return new OpenAPI()
        		.tags(null)
                .components(new Components())
                .info(info);
	}
}
