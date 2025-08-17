package com.tnif.manytomanymapping.entity.exception.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tnif.manytomanymapping.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

}