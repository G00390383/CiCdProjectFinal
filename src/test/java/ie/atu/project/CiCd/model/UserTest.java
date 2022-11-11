package ie.atu.project.CiCd.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
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