package com.wtmadaj.cvapi.dao;

import com.wtmadaj.cvapi.Skill;
import com.wtmadaj.cvapi.Skills;
import org.springframework.stereotype.Repository;

@Repository
public class SkillDAO {
    private static Skills list = new Skills();

    static {
        list.getSkillList().add(new Skill("Java"));
        list.getSkillList().add(new Skill("Spring"));
        list.getSkillList().add(new Skill("Maven"));
        list.getSkillList().add(new Skill("HTML"));
        list.getSkillList().add(new Skill("CSS"));
    }

    public Skills getAllSkills() {
        return list;
    }

    public void addSkill(Skill skill) {
        list.getSkillList().add(skill);
    }
}
