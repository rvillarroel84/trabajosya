package com.rvillarroel.trabajosya;

import com.rvillarroel.trabajosya.domain.Employee;
import com.rvillarroel.trabajosya.domain.EmployeeStatus;
import com.rvillarroel.trabajosya.domain.Job;
import com.rvillarroel.trabajosya.repository.JobRepository;
import com.rvillarroel.trabajosya.services.JobService;
import lombok.extern.java.Log;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@Log
@SpringBootApplication
public class TrabajosyaApplication implements CommandLineRunner {
    //private final JobRepository jobRepository;
    private final JobService jobService;
    public TrabajosyaApplication(JobService jobService) {
        //this.jobRepository = jobRepository;
        this.jobService = jobService;
    }

    public static void main(String[] args) {
        SpringApplication.run(TrabajosyaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


        Employee employee = new Employee();
        employee.setName("Ronny");
        employee.setApellido("Villarroel");

        Set<Employee> employeeSet1 = new HashSet<>();
        employeeSet1.add(employee);

        Job javaEEDeveloper = new Job(1L,"JavaEE Developer", 7000.00, EmployeeStatus.DISPONIBLE, employeeSet1);

//        Set<Employee> employeeSet = new HashSet<>();
//        employeeSet.add(employee);
//        javaEEDeveloper.setEmployees(employeeSet);

        jobService.saveJob(javaEEDeveloper);

        //Set<Job> jobs =  jobService.getJobs();

       // jobs.iterator().forEachRemaining(System.out::println);
        System.out.println("Hola");
    }
}
