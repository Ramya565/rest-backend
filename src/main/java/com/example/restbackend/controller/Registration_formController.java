package com.example.restbackend.controller;

import com.example.restbackend.model.Registration_form;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/api/registration")
public class Registration_formController {

    private List<Registration_form> registrationList = new ArrayList<>();

    @GetMapping("/registrationList")
    public List<Registration_form> getAllMembers() {
        return registrationList;
    }

    @PostMapping("/createMember")
    public ResponseEntity<String> createMember(@RequestBody Registration_form newMember) {
        // You can add validation logic here to ensure the data is valid before adding to the list.
        // For simplicity, we're assuming the data is valid.

        registrationList.add(newMember);

        return ResponseEntity.ok("Member created successfully.");
    }
}













    /*@GetMapping("/registrationList")
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
    }*/





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



