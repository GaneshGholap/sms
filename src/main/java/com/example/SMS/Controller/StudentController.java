package com.example.SMS.Controller;


import com.example.SMS.Dto.StudentDto;
import com.example.SMS.Entity.StudentEntity;
import com.example.SMS.Service.StudentService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")

public class StudentController {

@Autowired
    private StudentService studentService;

// Create API
    @PostMapping("/addStudent")
    public ResponseEntity<StudentEntity>  createStudent(@RequestBody StudentDto studentDto){
        StudentEntity student =studentService.createStudent(studentDto);
        return ResponseEntity.ok(student);
    }

    //get all records from table
    @GetMapping("/getAllRecord")
    public ResponseEntity<List<StudentEntity>> getAllStudentRecord(){
        List<StudentEntity> list = studentService.getAllStudent();
        return ResponseEntity.ok(list);
    }

    // Delete Record
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
        return ResponseEntity.noContent().build();
    }

    //Put reqst to Update student
    @PutMapping("/{id}")
    public ResponseEntity<StudentEntity> updateStudent(@PathVariable Long id,@RequestBody StudentDto studentDto){
        StudentEntity updateStudent = studentService.updateStudent(id, studentDto);
        return  ResponseEntity.ok(updateStudent);
    }

}





