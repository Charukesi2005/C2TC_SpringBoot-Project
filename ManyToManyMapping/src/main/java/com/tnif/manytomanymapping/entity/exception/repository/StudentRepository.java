package com.tnif.manytomanymapping.entity.exception.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.tnif.manytomanymapping.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}