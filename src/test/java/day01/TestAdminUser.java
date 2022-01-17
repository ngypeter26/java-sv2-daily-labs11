package day01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestAdminUser {

    @Test
    void testGetPassword(){
        User user = new AdminUser("ngypeter26@gmail.com","1234");

        assertEquals("****",user.getPassword());
    }
}
