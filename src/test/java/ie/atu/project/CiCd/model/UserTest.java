package ie.atu.project.CiCd.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    User Joe;

    @BeforeEach
    void setUp() {

    }


    @Test
    void set_name_test_success()
    {
        Joe = new User("Joe","92233AB",420);
        assertEquals("Joe",Joe.get_name());
    }

    @Test
    void set_credit_score_test_success()
    {
        Joe = new User("Joe","1234567LA",370);
        assertEquals(370,Joe.get_credit_score());
    }

    @AfterEach
    void tearDown() {

    }

}