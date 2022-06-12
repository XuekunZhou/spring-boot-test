package com.example.demo.controllers;

import com.example.demo.models.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/student")
public class StudentController {

    @GetMapping("/kim")
    public List<Student> getKim() {
        return List.of(new Student("Kim Possible", "kimp@email.com", LocalDate.of(2004, Month.JANUARY, 1)));

    }
}
