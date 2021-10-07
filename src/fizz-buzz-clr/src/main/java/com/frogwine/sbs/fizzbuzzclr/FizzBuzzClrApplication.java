package com.frogwine.sbs.fizzbuzzclr;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class FizzBuzzClrApplication {

	private static final Logger LOG = LoggerFactory.getLogger(FizzBuzzClrApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(FizzBuzzClrApplication.class, args);
		LOG.info("STARTING the FizzBuzz Application.");
		SpringApplication.run(FizzBuzzClrApplication.class, args);
		LOG.info("Application FizzBuzz FINISHED.");
	}

	@Bean
	public CommandLineRunner run() throws Exception {

		final int count = 100;
		FizzBuzzSolver fizzBuzzSolver = new FizzBuzzSolver(count);
		ArrayList<String> answers = fizzBuzzSolver.getAnswers();
		return args -> {
			LOG.info("EXECUTING: command line runner");
			for (String s : answers) {
				LOG.info(s);
			}
		};
	}
}
