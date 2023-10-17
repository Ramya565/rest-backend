package com.example.restbackend.controller.repository;

import com.example.restbackend.model.Registration_form;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Registration_form, Long> {
}
