package com.wtmadaj.cvapi.controller;

import com.wtmadaj.cvapi.Experience;
import com.wtmadaj.cvapi.Experiences;
import com.wtmadaj.cvapi.dao.ExperienceDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;


@RestController
@RequestMapping(path = "/experience")
public class ExperienceController {

    @Autowired
    private ExperienceDAO experienceDAO;

    @GetMapping(path="/", produces = "application/json")
    public Experiences getExperiences() {
        return experienceDAO.getAllExperiences();
    }

    @PostMapping(path = "/", consumes = "application/json", produces = "application/json")
    public Experiences addExperience(
            @RequestBody Experience experience) {

        experienceDAO.addExperience(experience);

        return getExperiences();
    }

}
