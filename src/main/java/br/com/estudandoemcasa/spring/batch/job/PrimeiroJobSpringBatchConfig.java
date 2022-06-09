package br.com.estudandoemcasa.spring.batch.job;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;

//@EnableBatchProcessing
//@Configuration
public class PrimeiroJobSpringBatchConfig {
	//@Autowired
	private JobBuilderFactory jobBuilderFactory;

	//@Bean
	public Job imprimeOlaJob(Step imprimeOlaStep) {
		return jobBuilderFactory
				.get("imprimeOlaJob")
				.start(imprimeOlaStep)
				.incrementer(new RunIdIncrementer())
				.build();
	}
}
