package com.chen.dogapiclientsdk;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("dogapi.client")
@Data
@ComponentScan
public class DogApiClientConfig {

    private String accessKey;

    private String secretKey;

    @Bean
    public com.chen.dogapiclientsdk.client.DogApiClient dogapiClient() {
        return new com.chen.dogapiclientsdk.client.DogApiClient(accessKey, secretKey);
    }

}
