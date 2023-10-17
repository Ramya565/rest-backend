package com.example.restbackend.controller;

import com.example.restbackend.model.Registration_form;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.List;

@WebMvcTest
class Registration_formControllerTest {

    @Autowired
        private MockMvc mockMvc;

        @Test
        public void testGetAllMembers() throws Exception {
            // Create a Registration_form object
            List<Registration_form> expectedMembers = List.of(
                    new Registration_form(1L, "John", "Doe", "johndoe@example.com", 30, "Male", 175.0, 70, 1234567890),
                    new Registration_form(2L, "Jane", "Smith", "janesmith@example.com", 25, "Female", 160.0, 60, 987654321)
            );



            String endpointUrl="/registrationList";
            //when
            mockMvc
                    .perform(MockMvcRequestBuilders.get(endpointUrl))
                    //then
                    .andExpect(MockMvcResultMatchers.status().is(200));






        }
    }


