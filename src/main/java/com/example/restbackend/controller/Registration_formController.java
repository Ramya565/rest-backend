package com.example.restbackend.controller;

import com.example.restbackend.controller.repository.PersonRepository;
import com.example.restbackend.model.Registration_form;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class Registration_formController {
    @Autowired
    private PersonRepository personRepository;


   @GetMapping("/registrationList")
   public List<Registration_form> getAllMembers() {

        List<Registration_form> registrationList = List.of(


        new Registration_form(1L, "John", "Doe", "johndoe@example.com", 30, "Male", 175.0, 70, 1234567890),
        new Registration_form(2L, "Jane", "Smith", "janesmith@example.com", 25, "Female", 160.0, 60, 987654321)
        );
                   return registrationList;


    }


}
