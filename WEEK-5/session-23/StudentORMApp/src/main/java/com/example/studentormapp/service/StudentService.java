package com.example.studentormapp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentormapp.entity.Student;
import com.example.studentormapp.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    public Student saveStudent(Student student) {
        return repo.save(student);
    }

    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    public Student getStudentById(int id) {
        return repo.findById(id).orElse(null);
    }

    public Student updateStudent(Student student) {
        return repo.save(student);
    }

    public String deleteStudent(int id) {
        repo.deleteById(id);
        return "Student deleted successfully";
    }
}