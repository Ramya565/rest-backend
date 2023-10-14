package com.example.restbackend;

import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.RestController;

import static org.junit.jupiter.api.Assertions.*;
@RestController

class LoginPageTest {
    @Test
    public void testGettersAndSetters() {
        // Create a LoginPage object
        LoginPage loginPage = new LoginPage("testUser", "testPassword");

        // Test the getters
        assertEquals("testUser", loginPage.getUserName());
        assertEquals("testPassword", loginPage.getPassword());

        // Test the setters
        loginPage.setUserName("newUser");
        loginPage.setPassword("newPassword");

        assertEquals("newUser", loginPage.getUserName());
        assertEquals("newPassword", loginPage.getPassword());
    }

}