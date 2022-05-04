package model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    public void testAddUser(){
        User user = new User("Tim",
                "Tim@live.com",
                "12345678");
        Assertions.assertEquals("Tim", user.getName());
        Assertions.assertEquals("Tim@live.com", user.getEmail());
        Assertions.assertEquals("12345678", user.getPassword());

    }


}