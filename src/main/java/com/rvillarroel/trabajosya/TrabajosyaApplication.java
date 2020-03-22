package com.rvillarroel.trabajosya;

import com.rvillarroel.trabajosya.domain.*;
import com.rvillarroel.trabajosya.services.EmployeeService;
import com.rvillarroel.trabajosya.services.EmployeerService;
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
    private final EmployeerService employeerService;
    private final EmployeeService employeeService;
    public TrabajosyaApplication(JobService jobService, EmployeerService employeerService, EmployeeService employeeService) {
        //this.jobRepository = jobRepository;
        this.jobService = jobService;
        this.employeerService = employeerService;
        this.employeeService = employeeService;
    }

    public static void main(String[] args) {
        SpringApplication.run(TrabajosyaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {


        Employee employee = new Employee();
        employee.setName("Ronny");
        employee.setApellido("Villarroel");


        Employee employee2 = new Employee();
        employee2.setName("Marcos");
        employee2.setApellido("Turicapa");


        Set<Employee> employeePosting = new HashSet<>();

        employeePosting.add(employee);
        employeePosting.add(employee2);

        Employeer employeer = new Employeer();
        employeer.setNombre("Red Hat");
        employeer.setDireccion("California AV/215");
        employeer.setTelefono("14-542224-122");


        Job javaEEDeveloper = new Job();//(1L,"JavaEE Developer", 7000.00, EmployeeStatus.DISPONIBLE, employeeSet1, employeer);
        javaEEDeveloper.setNombre("JavaEE Developer");
        javaEEDeveloper.setJornada(Tiempo.REMOTE);
        javaEEDeveloper.setEmployeesPosting(employeePosting);

        Set<Job> EmployeerJobs = new HashSet<>();
        EmployeerJobs.add(javaEEDeveloper);

        //relacion de Jobs que ofrece el Empleador
        employeer.setEmployeerJobs(EmployeerJobs);

        javaEEDeveloper.setSalario(3500.00);
        javaEEDeveloper.setHabilidades("Proven expertise of using bug tracking, version control management, and continuous integration systems\n" +
                "Good technical problem-solving and debugging skills\n" +
                "Strong verbal and written communication skills\n" +
                "Experience with the following technologies: Java, Java Spring Core, Spring Boot, Spring Core, Jira, Git, and JUnit\n" +
                "Experience working with Agile Scrum to develop and deliver software");
        javaEEDeveloper.setExperiencia("Bachelor’s degree in computer science, electronics engineering or other engineering or technical discipline is required\n" +
                "8 years of additional relevant experience may be substituted for education\n" +
                "5 years of relevant experience");
//        Set<Employee> employeeSet = new HashSet<>();
//        employeeSet.add(employee);
//        javaEEDeveloper.setEmployees(employeeSet);
        //relacion empleado que se postula al Job
        javaEEDeveloper.setEmployeesPosting(employeePosting);

        employee.setPostulaJobs(EmployeerJobs);
        employee2.setPostulaJobs(EmployeerJobs);

        employeerService.saveEmployeer(employeer);

        employeeService.saveEmployee(employee);
        employeeService.saveEmployee(employee2);


        jobService.saveJob(javaEEDeveloper);


        //Set<Job> jobs =  jobService.getJobs();

       // jobs.iterator().forEachRemaining(System.out::println);
        System.out.println("Hola");
    }
}
