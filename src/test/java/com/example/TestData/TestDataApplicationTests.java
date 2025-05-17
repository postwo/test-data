package com.example.TestData;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("test") //config.activate.on-profile 에서 설정한 값을 이용
@SpringBootTest
class TestDataApplicationTests {

	@Test
	void contextLoads() {
	}

}
