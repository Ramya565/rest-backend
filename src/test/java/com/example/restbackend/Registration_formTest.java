package com.example.restbackend;

import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.RestController;

import static org.junit.jupiter.api.Assertions.*;
@RestController
class Registration_formTest {


    String registerForm = "person details";
    @Test
    void registrationForm() {
        Registration_form form = new Registration_form(12L,
                "Ramya","krishna",
                "rkramya@gmail.com",28,"female",153.8,65,
                89491433L);



    }
}