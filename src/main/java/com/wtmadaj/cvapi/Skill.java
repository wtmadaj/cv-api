package com.wtmadaj.cvapi;

public class Skill {
    private String skillName;

    public Skill() {}

    public Skill(String skillName) {
        super();
        this.skillName = skillName;
    }

    public String getSkillName() {return skillName;}

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }
}
