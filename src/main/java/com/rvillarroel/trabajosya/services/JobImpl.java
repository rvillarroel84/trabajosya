package com.rvillarroel.trabajosya.services;

import com.rvillarroel.trabajosya.domain.Job;
import com.rvillarroel.trabajosya.repository.JobRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class JobImpl implements JobService {


    private final JobRepository jobRepository;

    public JobImpl(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @Override
    public Set<Job> getJobs() {

        Set<Job> jobs = new HashSet<>();
        jobRepository.findAll().iterator().forEachRemaining(jobs::add);
        return jobs;
    }

    @Override
    public Job findById(Long id) {

        Optional<Job> job = jobRepository.findById(id);
        if(!job.isPresent()){
            throw new RuntimeException("El trabajo no se encontro!");
        }
        return job.get();
    }

    @Override
    public void saveJob(Job job) {
        jobRepository.save(job);
    }
}
