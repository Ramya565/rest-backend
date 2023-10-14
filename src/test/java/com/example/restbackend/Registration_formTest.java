package com.example.restbackend;

import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.RestController;

import static org.junit.jupiter.api.Assertions.*;
@RestController
class Registration_formTest {

    @Test
    public void testGettersAndSetters() {
        // Create a Registration_form object
        Registration_form registration = new Registration_form(
                1L, "John",
                "Doe",
                "johndoe@example.com",
                30,
                "Male",
                175.0,
                70,
                1234567890L
        );

        // Test the getters
        assertEquals(1L, registration.getId());
        assertEquals("John", registration.getFirstName());
        assertEquals("Doe", registration.getLastName());
        assertEquals("johndoe@example.com", registration.getEmailId());
        assertEquals(30, registration.getAge());
        assertEquals("Male", registration.getGender());
        assertEquals(175.0, registration.getHeight());
        assertEquals(70, registration.getWeight());
        assertEquals(1234567890L, registration.getContactNumber());

        // Test the setters
        registration.setId(2L);
        registration.setFirstName("Jane");
        registration.setLastName("Smith");
        registration.setEmailId("janesmith@example.com");
        registration.setAge(25);
        registration.setGender("Female");
        registration.setHeight(160.0);
        registration.setWeight(60);
        registration.setContactNumber(9876543210L);

        assertEquals(2L, registration.getId());
        assertEquals("Jane", registration.getFirstName());
        assertEquals("Smith", registration.getLastName());
        assertEquals("janesmith@example.com", registration.getEmailId());
        assertEquals(25, registration.getAge());
        assertEquals("Female", registration.getGender());
        assertEquals(160.0, registration.getHeight());
        assertEquals(60, registration.getWeight());
        assertEquals(9876543210L, registration.getContactNumber());
    }
}
