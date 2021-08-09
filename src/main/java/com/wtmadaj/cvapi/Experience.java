package com.wtmadaj.cvapi;

public class Experience {
    private String employer;
    private String position;
    private String dates;
    private String description;

    public Experience() {}

    public Experience(String position, String employer, String dates, String description) {
        super();
        this.employer = employer;
        this.position = position;
        this.dates = dates;
        this.description = description;
    }

    @Override
    public String toString() {
        return position + ", " + employer + " " + dates + " " + description;
    }

    public String getEmployer() {
        return employer;
    }
    public void setEmployer(String employer) {
        this.employer = employer;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public String getDates() {
        return dates;
    }
    public void setDates(String dates) {
        this.dates = dates;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

}
