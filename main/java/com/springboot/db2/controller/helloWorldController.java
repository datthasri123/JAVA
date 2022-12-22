package com.springboot.db2.controller;

import com.springboot.db2.domain.Student;
import com.springboot.db2.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class helloWorldController {

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/home")
    public String hello() {
        Student S1 = new Student(23, "Siva", 32);
        studentRepository.save(S1);
        return  "hello Im spring rest, time now is " + LocalDateTime.now() + " successfully inserted row in db2";
    }

    @PostMapping(path="/home/insert", consumes = "application/json")
    public void createEmployee(@RequestBody Student student)
    {
        studentRepository.save(student);
    }
}
