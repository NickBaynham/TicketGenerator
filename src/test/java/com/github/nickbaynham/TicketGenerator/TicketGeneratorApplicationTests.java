package com.github.nickbaynham.TicketGenerator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TicketGeneratorApplicationTests {

	@Test
	public void testRandomNumber() {
		assertTrue(
				TicketGeneratorApplication.getRandomTicketNumber() > 1000 &&
				TicketGeneratorApplication.getRandomTicketNumber() < 9999
		);
	}

}
