package com.example.StudentManagementSystem;

import org.springframework.data.jpa.repository.JpaRepository;

public interface  StudentRepository extends JpaRepository<Student,Long>{
    //crud operations
}