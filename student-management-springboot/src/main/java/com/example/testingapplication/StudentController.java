package com.example.testingapplication;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    private final StudentService ss;

    public StudentController(StudentService ss) {
        this.ss = ss;
    }

    @PostMapping("/save")
    public Student saveStudent(@RequestParam int sno,
                               @RequestParam String sname) {
        return ss.saveStudent(sno, sname);
    }

    @GetMapping("/find/{sno}")
    public Optional<Student> getStudent(@PathVariable int sno) {
        return ss.getStudent(sno);
    }
}
