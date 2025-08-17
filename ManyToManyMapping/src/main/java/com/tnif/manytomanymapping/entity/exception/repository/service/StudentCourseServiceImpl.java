package com.tnif.manytomanymapping.entity.exception.repository.service;

import org.springframework.stereotype.Service;

import com.tnif.manytomanymapping.entity.Course;
import com.tnif.manytomanymapping.entity.Student;

@Service
public class StudentCourseServiceImpl implements StudentCourseService{
	 @Override
	    public void addStudentToCourse(Student student, Course course) {
	        // Add the student to the course
	        course.getStudents().add(student);
	        student.getCourses().add(course);
	    }
}