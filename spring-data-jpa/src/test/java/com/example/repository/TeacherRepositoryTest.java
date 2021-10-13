package com.example.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.entity.Course;
import com.example.entity.Teacher;

@SpringBootTest
class TeacherRepositoryTest {
	
	@Autowired
	private TeacherRepository teacherRepository;
	
	@Test
	public void saveTeacher() {
//		Course courseDBA =Course.builder()
//				.title("DBA")
//				.credit(5)
//				.build();
	//	Course courseJava=Course.builder().title("java").credit(9).build();
		
		Teacher teacher=Teacher.builder()
				.firstName("vinay")
				.lastName("bingi")
				//.courses(List.of(courseDBA, courseJava))
				.build();
		
		teacherRepository.save(teacher);
	}

}
