package com.example.restbackend.controller;

import com.example.restbackend.controller.repository.PersonRepository;
import com.example.restbackend.model.Registration_form;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class Registration_formController {
    @Autowired
    private PersonRepository personRepository;


    @GetMapping("/registrationList")
    public List<Registration_form> getAllMembers() {

        List<Registration_form> registrationList = List.of(


                new Registration_form(1L, "John", "Doe", "johndoe@example.com", 30, "Male", 175.0, 70),
                new Registration_form(2L, "Jane", "Smith", "janesmith@example.com", 25, "Female", 160.0, 60)
        );
        return registrationList;


    }

    @GetMapping("/registrationList")
    public ResponseEntity<String> registrationList() {
        try {
            List<String> contactNumberStrings = List.of("1234567890", "1325476980");
            List<Registration_form> registrationForms = new ArrayList<>();

            for (String contactNumberStr : contactNumberStrings) {
                Long contactNumber = Long.parseLong(contactNumberStr);
                Registration_form registrationForm = new Registration_form(contactNumber);
                registrationForms.add(registrationForm);
            }

            // Now you can work with the list of 'registrationForms'.

            return ResponseEntity.ok(registrationForms.toString());
        } catch (NumberFormatException e) {
            return ResponseEntity.badRequest().body("Invalid contact number format.");
        }
    }





       /* try {
            String contactNumberStr = "1234567890";
            Long contactNumber = Long.parseLong(contactNumberStr);
            Registration_form registrationForm = new Registration_form(contactNumber);
            return ResponseEntity.ok("Conversion successful. Contact Number: " + contactNumber);
        } catch (NumberFormatException e) {
            return ResponseEntity.badRequest().body("Invalid contact number format.");
        }
    }
*/

    }

