package com.jobportal.JobPortal.repositoy;

import com.jobportal.JobPortal.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JobRepo {
    List<JobPost> jobPosts=new ArrayList<>();

    public void addJob(JobPost jobPost){
        jobPosts.add(jobPost);
    }

    public List<JobPost> getAllJobs() {
        return jobPosts;
    }
}
