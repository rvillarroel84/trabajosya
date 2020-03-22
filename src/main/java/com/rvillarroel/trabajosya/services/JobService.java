package com.rvillarroel.trabajosya.services;

import com.rvillarroel.trabajosya.domain.Job;

import java.util.Set;


public interface JobService {
    Set<Job> getJobs();
    Job findById(Long id);
    void saveJob(Job job);
}