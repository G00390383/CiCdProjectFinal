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
    void set_name_test_fail()
    {
        Exception e_message = assertThrows(IllegalArgumentException.class, () -> Joe = new User("JT", "1234567AB", 700));
        assertEquals("Name must be 3 characters or longer",e_message.getMessage());

    }
    @Test
    void set_credit_score_test_success()
    {
        Joe = new User("Joe","1234567LA",370);
        assertEquals(370,Joe.get_credit_score());
    }

    @Test
    void set_credit_score_test_fail()
    {
        Exception e_message = assertThrows(IllegalArgumentException.class,() -> Joe = new User("Joe","1234567AA",900));
        assertEquals("Credit score can only be between 300 and 850",e_message.getMessage());
    }

    @Test
    void set_ppsn_test_success()
    {
        Joe = new User("Joe","1234567QQ",700);
        assertEquals("1234567QQ",Joe.get_ppsn());
    }

    @Test
    void set_ppsn_test_fail_1()
    {
        Exception e_message = assertThrows(IllegalArgumentException.class,()->Joe = new User("Joe","32142",400));
        assertEquals("PPSN number must be 8 or 9 characters long",e_message.getMessage());
    }

    @Test
    void set_ppsn_test_fail_2()
    {
        Exception e_message = assertThrows(IllegalArgumentException.class,()->Joe = new User("Joe","321423423",400));
        assertEquals("PPSN number must end with 1 or 2 characters",e_message.getMessage());
    }
    @AfterEach
    void tearDown() {

    }

}