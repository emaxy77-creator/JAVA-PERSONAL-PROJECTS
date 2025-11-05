package org.example.jobapp.service;

import org.example.jobapp.model.JobPost;
import org.example.jobapp.repository.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class JobService {
    @Autowired
    private JobRepo repo ;

    public void addJob(JobPost jobPost){
        repo.addJob(jobPost);
    }

    public List<JobPost> getAlljobs(){
        return repo.getAllJobs();
    }

}
