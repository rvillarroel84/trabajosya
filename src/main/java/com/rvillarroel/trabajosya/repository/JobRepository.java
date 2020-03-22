package com.rvillarroel.trabajosya.repository;

import com.rvillarroel.trabajosya.domain.Job;
import org.springframework.data.repository.CrudRepository;

public interface JobRepository extends CrudRepository<Job, Long> {
}
