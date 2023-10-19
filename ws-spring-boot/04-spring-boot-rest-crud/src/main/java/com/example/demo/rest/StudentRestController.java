package com.example.demo.rest;

import com.example.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> students;

    @PostConstruct
    public void loadData(){
        students = new ArrayList<>();
        students.add(new Student("Mat", "Ferreira", "software"));
        students.add(new Student("Bia", "Ferreira", "software"));
        students.add(new Student("Gusta", "Dias", "mecanica"));
    }
    @GetMapping("/students")
    public List<Student> getStudents(){
        return students;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId){
        if((studentId>= students.size())|| (studentId<0)){
            throw new StudentNotFoundException("Student id not found - " + studentId + ". Student ids available are between 0 and " + (students.size()-1));
        }
        return students.get(studentId);
    }




}


