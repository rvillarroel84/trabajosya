package com.rvillarroel.trabajosya.services;

import com.rvillarroel.trabajosya.domain.Employeer;
import com.rvillarroel.trabajosya.repository.EmployeerRepository;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class EmployeerImpl implements EmployeerService {

    private final EmployeerRepository employeerRepository;

    public EmployeerImpl(EmployeerRepository employeerRepository) {
        this.employeerRepository = employeerRepository;
    }

    @Override
    public void saveEmployeer(Employeer employeer) {
        employeerRepository.save(employeer);
    }

    @Override
    public Set<Employeer> getEmployeers() {
        return null;
    }
}
