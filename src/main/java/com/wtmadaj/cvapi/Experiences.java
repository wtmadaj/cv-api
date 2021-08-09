package com.wtmadaj.cvapi;

import java.util.ArrayList;
import java.util.List;

public class Experiences {

    private List<Experience> experienceList;

    public List<Experience> getExperienceList() {
        if(experienceList == null) {
            experienceList = new ArrayList<>();
        }
        return experienceList;
    }

    public void setExperienceList(List<Experience> experienceList) {
        this.experienceList = experienceList;
    }
}
