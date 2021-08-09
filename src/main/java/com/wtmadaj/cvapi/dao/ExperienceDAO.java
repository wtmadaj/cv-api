package com.wtmadaj.cvapi.dao;

import com.wtmadaj.cvapi.Experience;
import com.wtmadaj.cvapi.Experiences;
import org.springframework.stereotype.Repository;

@Repository
public class ExperienceDAO {
    private static Experiences list = new Experiences();

    static {
        list.getExperienceList().add(
                new Experience(
                        "Software Engineer",
                        "JPMorgan Chase & Co",
                        "July 2018 - Present",
                        "Description here"));
        list.getExperienceList().add(
                new Experience(
                        "Software Engineer",
                        "JPMorgan Chase & Co",
                        "July 2018 - Present",
                        "Description here"));
    }

    public Experiences getAllExperiences() {
        return list;
    }

    public void addExperience (Experience experience) {
        list.getExperienceList().add(experience);
    }
}
