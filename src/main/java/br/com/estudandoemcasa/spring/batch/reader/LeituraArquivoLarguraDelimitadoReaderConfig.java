package br.com.estudandoemcasa.spring.batch.reader;

import br.com.estudandoemcasa.spring.batch.model.Cliente;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.batch.item.file.transform.Range;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.PathResource;

//@Configuration
public class LeituraArquivoLarguraDelimitadoReaderConfig {

//    @StepScope
//    @Bean
    public FlatFileItemReader<Cliente> leituraArquivoLarguraDelimitadoReader(
            @Value("#{jobParameters['arquivoClientes']}") String arquivoClientes){

        return new FlatFileItemReaderBuilder<Cliente>()
                .name("leituraArquivoLarguraDelimitadoReader")
                .resource(new PathResource(arquivoClientes))
                .delimited()
                .names(new String[] {"nome", "sobrenome", "idade", "email"})
                .targetType(Cliente.class)
                .build();


    }
}
