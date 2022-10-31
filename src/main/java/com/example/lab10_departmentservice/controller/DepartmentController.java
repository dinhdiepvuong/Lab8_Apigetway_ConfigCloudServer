package com.example.lab10_departmentservice.controller;

import com.example.lab10_departmentservice.entity.Department;
import com.example.lab10_departmentservice.service.DepartmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("")
@Slf4j
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/department")
    public Department saveDepartment(@RequestBody Department department){
        log.info("Inside saveDeparment method if Department controller!");

        return departmentService.saveDepartment(department);
    }

    @GetMapping("/department/{id}")
    public Department findById(@PathVariable("id") Long departmentId){
        log.info("Inside findById method if Department controller!");

        return departmentService.findDepartmnet(departmentId);
    }

    @GetMapping("/department")
    public String helloWord(){

        return "Hello World Code of Diep Vuong ";
    }
}
