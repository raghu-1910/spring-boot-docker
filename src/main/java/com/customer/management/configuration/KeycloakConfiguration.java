package com.customer.management.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
@ConfigurationProperties(prefix = "jwt.auth.coverter")
public class KeycloakConfiguration {

	private String resourceId;
	private String principalAttribute;
	
	
}
