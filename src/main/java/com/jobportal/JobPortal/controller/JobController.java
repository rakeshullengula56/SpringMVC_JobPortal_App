package com.jobportal.JobPortal.controller;

import com.jobportal.JobPortal.model.JobPost;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class JobController {


    @GetMapping({"/","home"})
    public String home(){
        return "home";
    }
    @GetMapping("addJob")
    public String addJob(){
        return "addJob";
    }

    @GetMapping("viewAllJobs")
    public String allJobs(){
        return "viewAllJobs";
    }
    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost){
        return "success";
    }
}
