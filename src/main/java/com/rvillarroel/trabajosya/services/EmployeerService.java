package com.rvillarroel.trabajosya.services;

import com.rvillarroel.trabajosya.domain.Employeer;
import org.springframework.stereotype.Service;

import java.util.Set;


public interface EmployeerService {
    void saveEmployeer(Employeer employeer);
    Set<Employeer> getEmployeers();
}
