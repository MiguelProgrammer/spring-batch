package br.com.estudandoemcasa.spring.batch.reader;

import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.PathResource;

@Configuration
public class ArquivoLarguraMultiplosFormatosReaderConfig {

    @StepScope
    @Bean
    public FlatFileItemReader arquivoLarguraMultiplosFormatosReader(
            @Value("#{jobParameters['arquivoClientes']}") String arquivoClientes,
            LineMapper lineMapper){

        return new FlatFileItemReaderBuilder()
                .name("arquivoLarguraMultiplosFormatosReader")
                .resource(new PathResource(arquivoClientes))
                .lineMapper(lineMapper)
                .build();


    }
}
