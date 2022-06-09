package br.com.estudandoemcasa.spring.batch.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.FileSystemResource;

@Configuration
public class PropsConfig {

    @Bean
    public PropertySourcesPlaceholderConfigurer config(){
        PropertySourcesPlaceholderConfigurer configure = new PropertySourcesPlaceholderConfigurer();
        configure
                .setLocation(
                        new FileSystemResource(
                                "C:/Users/m.e.pereira.da.silva/Documents/studing/spring-batch-files-extern/application.properties"));
        return configure;
    }
}
