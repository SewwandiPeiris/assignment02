package com.example.StudentManagementSystem;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="")
public class Student{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) private long id;
    @Column(name = "", nullable=false) private String firstName;
    @Column(name = "", nullable=false) private String lastName;
    @Column(name = "", nullable=false) private String email;
    @Column(name = "", nullable=false) private String department;
    @Column(name = "", nullable=false) private String yearOfEnrollment;
}

