package com.example.testingapplication;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.data.jpa.test.autoconfigure.DataJpaTest;

@DataJpaTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository repository;

    @Test
    void testSaveAndFindStudent() {
        Student student = new Student(101, "Ravi");

        repository.save(student);

        Student result = repository.findById(101).orElse(null);

        assertNotNull(result);
        assertEquals("Ravi", result.getSname());
    }
}
	3
	
	++++++++++++++++++++++++++