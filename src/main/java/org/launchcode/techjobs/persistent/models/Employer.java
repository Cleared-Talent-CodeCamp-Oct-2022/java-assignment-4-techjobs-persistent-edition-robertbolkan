package org.launchcode.techjobs.persistent.models;


import javax.persistence.Entity;
import javax.persistence.JoinColumn;

import javax.persistence.OneToMany;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotNull(message = "location must not be null")
    @NotBlank(message = "location must not be blank")
    @Size(min = 2, max = 100, message = "location must be between 2 and 100 characters")
    private String location;

    @OneToMany(mappedBy = "employer")
//    @JoinColumn(name = "employer_id")
    private List<Job> jobs = new ArrayList<>();

    public Employer() {}

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Job> getJobs() {
        return jobs;
    }
}
