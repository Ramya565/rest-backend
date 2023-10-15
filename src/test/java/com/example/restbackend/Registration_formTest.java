package com.example.restbackend;

import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@RestController
class Registration_formTest {

    @Test
    public void testGettersAndSetters() {
        // Create a Registration_form object
        List<Registration_form> registrationList = new ArrayList<>();

        // Add Registration_form objects to the list
        registrationList.add(new Registration_form(1L, "John", "Doe", "johndoe@example.com", 30, "Male", 175.0, 70, 1234567890L));
        registrationList.add(new Registration_form(2L, "Jane", "Smith", "janesmith@example.com", 25, "Female", 160.0, 60, 9876543210L));

        Registration_form firstRegistration = registrationList.get(0);
        Registration_form secondRegistration = registrationList.get(1);


        assert(firstRegistration.getId() == 1L);
        assert(firstRegistration.getFirstName().equals("John"));
        assert(firstRegistration.getLastName().equals("Doe"));
        assert(firstRegistration.getEmailId().equals("johndoe@example.com"));
        assert(firstRegistration.getAge() == 30);
        assert(firstRegistration.getGender().equals("Male"));
        assert(firstRegistration.getHeight() == 175.0);
        assert(firstRegistration.getWeight() == 70);
        assert(firstRegistration.getContactNumber() == 1234567890L);

        // Assertion to verify the correctness of the second registration

        assert(secondRegistration.getId() == 2L);
        assert(secondRegistration.getFirstName().equals("Jane"));
        assert(secondRegistration.getLastName().equals("Smith"));
        assert(secondRegistration.getEmailId().equals("janesmith@example.com"));
        assert(secondRegistration.getAge() == 25);
        assert(secondRegistration.getGender().equals("Female"));
        assert(secondRegistration.getHeight() == 160.0);
        assert(secondRegistration.getWeight() == 60);
        assert(secondRegistration.getContactNumber() == 9876543210L);







    }
}
        
