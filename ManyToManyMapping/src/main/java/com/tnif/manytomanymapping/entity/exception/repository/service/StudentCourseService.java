package com.tnif.manytomanymapping.entity.exception.repository.service;

import com.tnif.manytomanymapping.entity.Course;
import com.tnif.manytomanymapping.entity.Student;

public interface StudentCourseService {
	void addStudentToCourse(Student student, Course course);
}