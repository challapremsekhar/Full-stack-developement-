package com.example.studentormapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.studentormapp.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}