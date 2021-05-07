package com.niharika.coursmanager.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:Config.properties")
public class ApplicationConfiguration {
@Bean
public PropertySourcesPlaceholderConfigurer PropertyConfig() {
	return new PropertySourcesPlaceholderConfigurer();
}
}
