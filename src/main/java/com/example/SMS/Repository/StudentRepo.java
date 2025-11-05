package com.example.SMS.Repository;

import com.example.SMS.Entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository <StudentEntity, Long> {

}
