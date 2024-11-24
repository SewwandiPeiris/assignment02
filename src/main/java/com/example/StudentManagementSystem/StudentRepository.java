package com.example.StudentManagementSystem;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface  StudentRepository extends JpaRepository<Student,Long>{
    
    @Query("SELECT s FROM Student s WHERE s.yearOfEnrollment = :year")
    List<Student> findByYearOfEnrollment(@Param("year") String year);

    
    @Query("SELECT s.department FROM Student s WHERE s.id = :id")
    String findDepartmentById(@Param("id") long id);

    
    void deleteByYearOfEnrollment(String yearOfEnrollment);
}
