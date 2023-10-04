package com.firstproject.demo.student;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@Service
public class StudentService {
    private final StudentRespository studentRespository;
    public StudentService(StudentRespository studentRespository){
        this.studentRespository = studentRespository;
    }
    public List<Student> getStudent(){
        return studentRespository.findAll();
    }
}
