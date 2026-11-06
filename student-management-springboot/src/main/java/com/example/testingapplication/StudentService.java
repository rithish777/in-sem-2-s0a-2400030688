package com.example.testingapplication;

import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    private final StudentRepository sr;

    public StudentService(StudentRepository sr) {
        this.sr = sr;
    }

    public Student saveStudent(int sno, String sname) {
        Student student = new Student(sno, sname);
        return sr.save(student);
    }

    public Optional<Student> getStudent(int sno) {
        return sr.findById(sno);
    }
}
