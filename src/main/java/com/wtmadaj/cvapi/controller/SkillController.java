package com.wtmadaj.cvapi.controller;

import com.wtmadaj.cvapi.Skill;
import com.wtmadaj.cvapi.Skills;
import com.wtmadaj.cvapi.dao.SkillDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/skills")
public class SkillController {

    @Autowired
    private SkillDAO skillDAO;

    @GetMapping(path="/", produces = "application/json")
    public Skills getSkills() {
        return skillDAO.getAllSkills();
    }

    @PostMapping(path = "/", consumes = "application/json", produces = "application/json")
    public Skills addSkill(
            @RequestBody Skill skill) {

        skillDAO.addSkill(skill);

        return getSkills();
    }

}
