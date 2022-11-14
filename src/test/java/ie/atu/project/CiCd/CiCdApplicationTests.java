package ie.atu.project.CiCd;

import ie.atu.project.CiCd.model.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CiCdApplicationTests {
	User Joe;
	@AfterEach
	void tearDown() {

	}

	@Test
	void set_name_test_success()
	{
		Joe = new User("Joe","92233AB",100);
		assertEquals("Joe",Joe.get_name());
	}

	@BeforeEach
	void setUp() {
	}
}
