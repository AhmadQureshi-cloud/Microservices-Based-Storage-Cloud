package com.filecloud.documentservice.configuration;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestTemplate;

import com.filecloud.documentservice.properties.DocumentServiceProperties;


@Configuration
@EnableConfigurationProperties({
		DocumentServiceProperties.class
})
public class DocumentServiceConfiguration {

	@LoadBalanced
	@Bean
	@Primary
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

}
