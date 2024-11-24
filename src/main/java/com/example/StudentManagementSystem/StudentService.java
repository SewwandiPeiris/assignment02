package com.example.StudentManagementSystem;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface StudentService {
    Student saveStudent(Student student);
    List<Student> getAllStudents();
    Student getStudentById(long id);
    Student updateStudent(Student student,long id);
    void deleteStudent(long id);
    List<Student> getStudentsByYear(String yearOfEnrollment);
    String getDepartmentByStudentId(long id);
    void deleteStudentsByYear(String yearOfEnrollment);

}
