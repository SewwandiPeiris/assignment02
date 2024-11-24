package com.example.StudentManagementSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/students")
public class StudentController{
    @Autowired
    private StudentService studentService;

    @PostMapping
    public ResponseEntity<Student> saveStudent(@RequestBody Student student){
        return new ResponseEntity<Student> (studentService.saveStudent(student),HttpStatus.CREATED);
    }
        
    @GetMapping
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable("id") long studentID){
        return new ResponseEntity<Student> (studentService.getStudentById(studentID),HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable("id") long id, @RequestBody Student student){
        return new ResponseEntity<>(studentService.updateStudent(student,id),HttpStatus.OK);
    }
        
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable("id") long id){
        studentService.deleteStudent(id);
        return new ResponseEntity<String>("Student deleted Successfully.",HttpStatus.OK);
    }
    
    @GetMapping("/year/{year}")
    public ResponseEntity<List<Student>> getStudentsByYear(@PathVariable("year") String year) {
        return ResponseEntity.ok(studentService.getStudentsByYear(year));
    }

    @GetMapping("/{id}/department")
    public ResponseEntity<String> getDepartmentByStudentId(@PathVariable("id") long id) {
        return ResponseEntity.ok(studentService.getDepartmentByStudentId(id));
    }

    @DeleteMapping("/year/{year}")
    public ResponseEntity<String> deleteStudentsByYear(@PathVariable("year") String year) {
        studentService.deleteStudentsByYear(year);
        return ResponseEntity.ok("Students enrolled in year " + year + " have been deleted successfully.");
    }
}