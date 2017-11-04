package net.mfjassociates.tools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JitterDaemon {

	public static void main(String[] args) {
		SpringApplication.run(JitterDaemon.class, args);
	}
	@Bean
	public CommandLineRunner run() {
		return args -> {
			ExecutorService executor = Executors.newSingleThreadExecutor();
			executor.submit(new JitterHelper());
		};
	};
}
