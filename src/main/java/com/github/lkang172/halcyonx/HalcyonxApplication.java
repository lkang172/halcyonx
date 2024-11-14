package com.github.lkang172.halcyonx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.CommandLineRunner;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

import com.github.lkang172.run.Location;
import com.github.lkang172.run.Run;

@SpringBootApplication(scanBasePackages = "com.github.lkang172", exclude = { DataSourceAutoConfiguration.class })
public class HalcyonxApplication {

	private static final Logger log = LoggerFactory.getLogger(HalcyonxApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(HalcyonxApplication.class, args);
		log.info("Application started running successfully");

	}

	@Bean
	CommandLineRunner runner() {
		return args -> {
			Run run = new Run(1, "First run", LocalDateTime.now(), LocalDateTime.now().plus(1, ChronoUnit.HOURS), 5,
					Location.OUTDOOR);
			log.info("Run: " + run);
		};
	}

}
