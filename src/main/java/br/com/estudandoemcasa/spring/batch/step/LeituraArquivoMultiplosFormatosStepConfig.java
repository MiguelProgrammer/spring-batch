package br.com.estudandoemcasa.spring.batch.step;

import br.com.estudandoemcasa.spring.batch.reader.ArquivoClienteTransacaoReader;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SuppressWarnings("ALL")
@Configuration
public class LeituraArquivoMultiplosFormatosStepConfig {

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Bean
    public Step leituraArquivoMultiplosFormatosStep (
            FlatFileItemReader leituraArquivoLarguraFixaReader,
            ItemWriter leituraArquivoLarguraFixaWriter) {
        return stepBuilderFactory
                .get("leituraArquivoMultiplosFormatosStep")
                .chunk(1)
                .reader(new ArquivoClienteTransacaoReader(leituraArquivoLarguraFixaReader))
                .writer(leituraArquivoLarguraFixaWriter)
                .build();
    }
}
