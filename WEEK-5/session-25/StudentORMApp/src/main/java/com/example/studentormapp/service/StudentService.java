package com.example.studentormapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import com.example.studentormapp.entity.Student;
import com.example.studentormapp.repository.StudentRepository;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    // CREATE
    public Student saveStudent(Student student) {
        return repo.save(student);
    }

    // READ ALL
    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    // READ BY ID
    public Student getStudentById(Integer id) {
        return repo.findById(id).orElse(null);
    }

    // DELETE
    public String deleteStudent(Integer id) {
        repo.deleteById(id);
        return "Student deleted";
    }

    // UPDATE
    public Student updateStudent(Student student) {
        return repo.save(student);
    }

    // CUSTOM QUERY
    public List<Student> getStudentsByDepartment(String dept) {
        return repo.findByDepartment(dept);
    }

    public List<Student> getStudentsByAge(Integer age) {
        return repo.findByAge(age);
    }

    // SORTING
    public List<Student> getStudentsSorted(String field) {
        return repo.findAll(Sort.by(Sort.Direction.ASC, field));
    }

    // PAGINATION
    public Page<Student> getStudentsWithPagination(int offset, int pageSize) {
        Pageable pageable = PageRequest.of(offset, pageSize);
        return repo.findAll(pageable);
    }

    // PAGINATION + SORTING
    public Page<Student> getStudentsWithPaginationAndSort(int offset, int pageSize, String field) {

        Pageable pageable =
                PageRequest.of(offset, pageSize).withSort(Sort.by(field));

        return repo.findAll(pageable);
    }
}