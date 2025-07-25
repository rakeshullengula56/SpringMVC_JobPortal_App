package com.jobportal.JobPortal.controller;

import com.jobportal.JobPortal.model.JobPost;
import com.jobportal.JobPortal.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
public class JobController {

    @Autowired
    private JobService jobService;

    @GetMapping({"/","home"})
    public String home(){
        return "home";
    }
    @GetMapping("addJob")
    public String addJob(){
        return "addJob";
    }

    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost){
        jobService.addJob(jobPost);
        return "success";
    }
    @GetMapping("viewAllJobs")
    public String viewAllJobs(Model model){
        List<JobPost> jobs=jobService.getAllJobs();
        model.addAttribute("jobPosts",jobs);
        return "viewAllJobs";
    }
}
