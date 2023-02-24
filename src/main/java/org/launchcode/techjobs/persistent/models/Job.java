package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Job extends AbstractEntity {



    @ManyToOne
//    @JoinColumn(name = "employer_id")
    private Employer employer;

    @ManyToMany
    @Size(min = 1, message = "Please select at least one skill")
    private List<Skill> skills;

    public Job() {}

    public Job(Employer employer, List<Skill> skills) {
        super();
        this.employer = employer;
        this.skills = skills;
    }

    // Getters and setters.



    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }


}
