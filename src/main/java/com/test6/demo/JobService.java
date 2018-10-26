package com.test6.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepository jobRepository;

    private   List<Job> jobs =  new ArrayList<>(Arrays.asList(
          new Job(1,1,1 ),
          new Job(2,2,2 ),
          new Job(3,3,3 )
    ));

    public List<Job> getAllJobs(){

        List<Job> jobs = new ArrayList<>();
        jobRepository.findAll().forEach(jobs::add);
        return jobs;
    }


    public Job getJobs(int id){


        Job t = jobRepository.findById(String.valueOf(id)).get();
        return t;
    }



    public void addJob(Job job){

        jobRepository.save(job);
    }

    public void updateJob(int id, Job job){


        jobRepository.save(job);
    }

    public void deleteJob(int id){


        jobRepository.deleteById(String.valueOf(id));
    }

}
