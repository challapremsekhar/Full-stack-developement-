package com.example.studentormapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import com.example.studentormapp.entity.Student;
import com.example.studentormapp.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService service;

    // CREATE
    @PostMapping("/add")
    public Student addStudent(@RequestBody Student student) {
        return service.saveStudent(student);
    }

    // GET ALL
    @GetMapping("/all")
    public List<Student> getAllStudents() {
        return service.getAllStudents();
    }

    // GET BY ID
    @GetMapping("/{id}")
    public Student getStudent(@PathVariable Integer id) {
        return service.getStudentById(id);
    }

    // UPDATE
    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student) {
        return service.updateStudent(student);
    }

    // DELETE
    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Integer id) {
        return service.deleteStudent(id);
    }

    // SEARCH BY DEPARTMENT
    @GetMapping("/department/{dept}")
    public List<Student> getByDepartment(@PathVariable String dept) {
        return service.getStudentsByDepartment(dept);
    }

    // SEARCH BY AGE
    @GetMapping("/age/{age}")
    public List<Student> getByAge(@PathVariable Integer age) {
        return service.getStudentsByAge(age);
    }

    // SORTING
    @GetMapping("/sort/{field}")
    public List<Student> sortStudents(@PathVariable String field) {
        return service.getStudentsSorted(field);
    }

    // PAGINATION
    @GetMapping("/page/{offset}/{size}")
    public Page<Student> pagination(@PathVariable int offset,
                                    @PathVariable int size) {
        return service.getStudentsWithPagination(offset, size);
    }

    // PAGINATION + SORTING
    @GetMapping("/page/{offset}/{size}/{field}")
    public Page<Student> paginationSort(@PathVariable int offset,
                                        @PathVariable int size,
                                        @PathVariable String field) {
        return service.getStudentsWithPaginationAndSort(offset, size, field);
    }
}