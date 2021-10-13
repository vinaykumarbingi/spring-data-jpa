package com.example.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.entity.Course;
import com.example.entity.Student;
import com.example.entity.Teacher;

@SpringBootTest
class CourseRepositoryTest {
	
	@Autowired
	private CourseRepository courseRepository;
	
//	@Test
//	public void printCourses() {
//		List<Course> courses =courseRepository.findAll();
//		
//		System.out.println();System.out.println(courses);System.out.println();
//	}
//	@Test
//	public void saveCourseWithTeacher()
//	{
//		Teacher teacher=Teacher.builder()
//				.firstName("mogili")
//				.lastName("bingi")
//				.build();
//		
//		Course course=Course.builder()
//				.title("python")
//				.credit(6)
//				.teacher(teacher)
//				.build();
//		
//		courseRepository.save(course);
//	}
//	@Test
//	public void findALlPagination()
//	{
//			Pageable firstPageWithThree=PageRequest.of(0,3);
//			Pageable secondPageWithTwo=PageRequest.of(1,2);
//			
//			List<Course> courses=courseRepository.findAll(secondPageWithTwo).getContent();
//			System.out.println(); System.out.println(courses); System.out.println();
//			
//			long totalElements=courseRepository.findAll(secondPageWithTwo).getTotalElements();
//			long totalPages=courseRepository.findAll(secondPageWithTwo).getTotalPages();
//			
//			System.out.println("elements"+totalElements);
//			System.out.println();
//			System.out.println("pages"+totalPages);
//			
//	}
	
//	@Test
//	public void findALlPagination()
//	{
//			Pageable sortByTitle=PageRequest.of(0,2,Sort.by("title"));
//			Pageable sortByCreditDesc=PageRequest.of(0,2, Sort.by("credit").descending());
//			Pageable sortByTitleAndCreditDesc=PageRequest.of(0,2, Sort.by("title").descending().and(Sort.by("credit")));
//			
//			List<Course> courses=courseRepository.findAll(sortByTitle).getContent();
//			System.out.println(); System.out.println(courses); System.out.println();
//			
//			long totalElements=courseRepository.findAll(secondPageWithTwo).getTotalElements();
//			long totalPages=courseRepository.findAll(secondPageWithTwo).getTotalPages();
//			
//			System.out.println("elements"+totalElements);
//			System.out.println();
//			System.out.println("pages"+totalPages);
//			
//	}
//	@Test
//	public void printFindByTitleContaining()
//	{
//		Pageable firstPAgeTenRec=PageRequest.of(0, 10);
//		
//		List<Course> courses=courseRepository.findByTitleContaining("D",firstPAgeTenRec).getContent();
//		
//		System.out.println();
//		System.out.println(courses);
//		System.out.println();
//	}
	
	@Test
	public void saveCourseWithStudentAndTeacher()
	{
		Teacher teacher=Teacher.builder()
				.firstName("sir")
				.lastName("sirr")
				.build();
		Student student=Student.builder()
				.firstName("boy").lastName("men").emailId("vinay@vinay.com")
				.build();
		
		
		Course course=Course.builder()
				.title("AI")
				.credit(12)
				.teacher(teacher)
				.build();
		
		course.addStudents(student);
		
		courseRepository.save(course);
		
		
	}
	
}
