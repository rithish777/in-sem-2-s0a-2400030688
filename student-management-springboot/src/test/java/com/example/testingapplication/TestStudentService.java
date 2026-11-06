package com.example.testingapplication;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;

class TestStudentService {

    @Test
    void testGetStudent() {
        StudentRepository repository = mock(StudentRepository.class);
        StudentService service = new StudentService(repository);
        Student student = new Student(101, "Ravi");

        when(repository.findById(101)).thenReturn(Optional.of(student));

        Student result = service.getStudent(101).orElse(null);

        assertNotNull(result);
        assertEquals(101, result.getSno());
        assertEquals("Ravi", result.getSname());
    }
}
