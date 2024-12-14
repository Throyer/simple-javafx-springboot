package com.github.throyer.sample;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@Tag("Unit")
@TestPropertySource(properties = {
  "spring.datasource.driver-class-name=org.h2.Driver",
  "spring.datasource.url=jdbc:h2:mem:db",
  "spring.datasource.username=sa",
  "spring.datasource.password=sa",
})
@SpringBootTest
class MainTests {
	@Test
	void contextLoads() { }
}
