package com.example.lab10_departmentservice.service;

import com.example.lab10_departmentservice.entity.Department;
import com.example.lab10_departmentservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department){
        log.info("Inside saveDepartment of Service! ");
        return departmentRepository.save(department);
    }

    public Department findDepartmnet(Long departmentId){
        log.info("Inside findDeparmentById of Service! ");
        return departmentRepository.findById(departmentId).get();
    }
}
