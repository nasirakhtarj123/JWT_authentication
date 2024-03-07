package com.jwtauthentication.jwtauthentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
// (exclude = {
// org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration.class,
// org.springframework.boot.autoconfigure.ssl.SslAutoConfiguration.class,
// org.springframework.boot.autoconfigure.context.LifecycleAutoConfiguration.class,
// org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration.class,
// org.springframework.boot.autoconfigure.availability.ApplicationAvailabilityAutoConfiguration.class,
// org.springframework.boot.autoconfigure.info.ProjectInfoAutoConfiguration.class
// })
public class JwtauthenticationApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(JwtauthenticationApplication.class, args);
	}

}
