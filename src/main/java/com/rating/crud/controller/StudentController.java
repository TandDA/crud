package com.rating.crud.controller;

import com.rating.crud.dto.StudentDto;
import com.rating.crud.model.Student;
import com.rating.crud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    StudentRepository studentRepository;
    @GetMapping("/get")
    public Iterable<Student> getAll(){
        return studentRepository.findAll();
    }
    @GetMapping("/get/{id}")
    public Student getAll(@PathVariable int id){
        return studentRepository.findById(id).get();
    }
    @PostMapping("create")
    public Student create(@RequestBody StudentDto studentDto){
        Student student = new Student();
        student.setCourse(studentDto.getCourse());
        student.setStudentGroup(studentDto.getStudentGroup());
        student.setName(studentDto.getName());
        student.setFaculty(studentDto.getFaculty());

        return studentRepository.save(student);
    }
    @PutMapping("/update")
    public Student update(@RequestBody Student studentRequest){
        return studentRepository.save(studentRequest);
    }
    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable int id){
        studentRepository.deleteById(id);
    }
}
