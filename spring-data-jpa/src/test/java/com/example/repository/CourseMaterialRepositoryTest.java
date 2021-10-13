package com.example.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.entity.Course;
import com.example.entity.CourseMaterial;

@SpringBootTest
class CourseMaterialRepositoryTest {
	
	@Autowired
	private CourseMaterialRepository repository;
	
	@Test
	public void saveCourseMaterial() {
		
		Course course=Course.builder()
				.title(".net")
				.credit(10)
				.build();
		
		CourseMaterial courseMaterial =CourseMaterial.builder()
				.url("www.kumar.com")
				.course(course)
				.build();
		
		repository.save(courseMaterial);
	}
	@Test
	public void printAllCourseMaterial() {
		List<CourseMaterial> courseMaterial=repository.findAll();
		System.out.println();
		System.out.println("list of course material"+courseMaterial);
		System.out.println();
	}

}
