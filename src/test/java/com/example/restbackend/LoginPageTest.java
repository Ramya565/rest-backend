package com.example.restbackend;

import org.junit.jupiter.api.Test;
import org.springframework.web.bind.annotation.RestController;

import static org.junit.jupiter.api.Assertions.*;
@RestController
class LoginPageTest {
    @Test
    void LoginPage(){
        LoginPage person=new LoginPage("Ramya","Ramya");
        person.getUsername();
        person.getPassword();
    }


}