package com.wtmadaj.cvapi;

import java.util.ArrayList;
import java.util.List;

public class Skills {
    private List<Skill> skillList;

    public List<Skill> getSkillList() {
        if(skillList == null) {
            skillList = new ArrayList<>();
        }
        return skillList;
    }

    public void setSkillList(List<Skill> skillList) {
        this.skillList = skillList;
    }
}
