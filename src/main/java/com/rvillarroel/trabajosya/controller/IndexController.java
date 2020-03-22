package com.rvillarroel.trabajosya.controller;

import com.rvillarroel.trabajosya.services.JobService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    private final JobService jobService;

    public IndexController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("/")
    public String index(Model model){

      model.addAttribute("jobs", jobService.getJobs());
      return "index";
    }
}
