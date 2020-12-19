package com.github.nickbaynham.TicketGenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TicketGeneratorApplication {
	public static double getRandomTicketNumber() {
		final double MIN_RANDOM_TICKET_NUMBER = 1000;
		final double MAX_RANDOM_TICKET_NUMBER = 9999;
		return (Math.random() * (MAX_RANDOM_TICKET_NUMBER - MIN_RANDOM_TICKET_NUMBER)) + MIN_RANDOM_TICKET_NUMBER;
	}
	public static void main(String[] args) {
		SpringApplication.run(TicketGeneratorApplication.class, args);
	}

}
