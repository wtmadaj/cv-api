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
                        "Led and always participated in all aspects of the Agile/Scrum software development life cycle - sprint planning, refinement, requirements gathering, retrospectives, etc." +
                                 " Championed initiatives for large scale data center migration efforts."));
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
