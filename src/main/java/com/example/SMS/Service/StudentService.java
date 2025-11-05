package com.example.SMS.Service;

import com.example.SMS.Dto.StudentDto;
import com.example.SMS.Entity.StudentEntity;
import com.example.SMS.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepo studentRepo;

    public StudentEntity createStudent(StudentDto studentDto) {

        StudentEntity studentEntity = new StudentEntity();

        studentEntity.setFirst_name(studentDto.getFirst_name());
        studentEntity.setLast_name(studentDto.getLast_name());
        studentEntity.setDOB(studentDto.getDOB());
        studentEntity.setGender(studentDto.getGender());
        studentEntity.setEmail_id(studentDto.getEmail_id());
        studentEntity.setMob_no(studentDto.getMob_no());
        studentEntity.setAddress(studentDto.getAddress());
        studentEntity.setEnrollment_date(studentDto.getEnrollment_date());

        return studentRepo.save(studentEntity);
    }

    public List<StudentEntity> getAllStudent() {

        return studentRepo.findAll();
    }

    public void deleteStudent(Long id) {
        studentRepo.deleteById(id);
    }

    public StudentEntity updateStudent(Long id, StudentDto studentDto) {

        Optional<StudentEntity> optionalStudent = studentRepo.findById(id);

        if (optionalStudent.isPresent()) {
            StudentEntity studentEntity = optionalStudent.get();

            studentEntity.setFirst_name(studentDto.getFirst_name());
            studentEntity.setLast_name(studentDto.getLast_name());
            studentEntity.setDOB(studentDto.getDOB());
            studentEntity.setGender(studentDto.getGender());
            studentEntity.setEmail_id(studentDto.getEmail_id());
            studentEntity.setMob_no(studentDto.getMob_no());
            studentEntity.setAddress(studentDto.getAddress());
            studentEntity.setEnrollment_date(studentDto.getEnrollment_date());
            return studentRepo.save(studentEntity);
        } else {
            throw new RuntimeException("student not found by id: " + id);
        }
    }
}