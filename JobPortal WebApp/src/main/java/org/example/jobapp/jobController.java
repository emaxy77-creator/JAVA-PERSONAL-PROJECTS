package org.example.jobapp;

import org.example.jobapp.model.JobPost;
import org.example.jobapp.service.JobService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
public class jobController {
    private final JobService service;

    public jobController(JobService jobService) {
        this.service= jobService;
    }

    @GetMapping({"/", "home"})
    public String home(){
        return "home";
    }

    @GetMapping("addjob")
    public String addJob(){
        return "addjob";
    }

    @PostMapping("handleForm")
    public String handleForm(JobPost jobPost){
        service.addJob(jobPost);
        return "success";
    }


    @GetMapping ("viewalljobs")
    public String viewJobs(Model model){
        List<JobPost> jobs = service.getAlljobs();
        model.addAttribute("jobPosts", jobs);
        return "viewalljobs";
    }

}

