package br.com.testmicronaut;

import io.micronaut.spring.beans.MicronautBeanProcessor;
import io.micronaut.spring.context.MicronautApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TestMicronautApplication {

	public static void main(String[] args) {
		MicronautApplicationContext context = new MicronautApplicationContext();
		context.start();
		new SpringApplicationBuilder()
				.logStartupInfo(true)
				.parent(context)
				.sources(TestMicronautApplication.class)
				.build().run();
	}

	@Bean
	public static MicronautBeanProcessor beanProcessor() {
		return new MicronautBeanProcessor(UsersMicronautController.class);
	}
}
