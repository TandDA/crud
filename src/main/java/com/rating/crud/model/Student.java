package com.rating.crud.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "faculty")
    private String faculty;
    @Column(name = "course")
    private String course;
    @Column(name = "student_group")
    private String studentGroup;
}
