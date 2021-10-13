package com.example.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.entity.Guardian;
import com.example.entity.Student;


@SpringBootTest
class StudentRepositoryTest {
	
	@Autowired
	private StudentRepository studentRepository;
	
//	@Test
//	public void saveStudent()
//	{
//		Student student=new Student().builder()
//				.emailId("vinay@vinay")
//				.firstName("vinay")
//				.lastName("kumar")
//				.guardianName("mogili")
//				.guardianEmail("mogili@mogili")
//				.guardianMobile("9177762320")
//				.build();
//		
//		studentRepository.save(student);
//	}
	
	
//	@Test
//	public void printAllStudent()
//	{
//		List<Student> studentList=studentRepository.findAll();
//		System.out.println("Student List= "+studentList);
//	}
	
	
//	@Test
//	public void saveStudentWithGuardian()
//	{
//		Guardian guardian=new Guardian().builder()
//				.name("father")
//				.email("f@f")
//				.mobile("97112234")
//				.build();
//		
//		Student student=new Student().builder()
//				.emailId("b@b")
//				.firstName("bingi")
//				.lastName("kumar")
//				.guardian(guardian)
//				.build();
//		studentRepository.save(student);
//	}
	
	
//	@Test
//	public void printStudentByFirstName()
//	{
//		List<Student> students=studentRepository.findByFirstName("vinay");
//		System.out.println("students= "+students);
//	}
	
	
//	@Test
//	public void printStudentByFirstNameContaining()
//	{
//		List<Student> students=studentRepository.findByFirstNameContaining("bi");
//		System.out.println();
//		System.out.println("students= "+students);
//		System.out.println();
//	}
	
//	
//	@Test
//	public void printStudentByGuardianName()
//	{
//		List<Student> students=studentRepository.findByGuardianName("father");
//		System.out.println();
//		System.out.println("students= "+students);
//		System.out.println();
//	}
	
//	@Test
//	public void printGetStudentByEmailAddress()
//	{
//		List<Student> student=studentRepository.getStudentByEmailAddress("mogili@mogili");
//		System.out.println();
//		System.out.println("student= "+student);
//		System.out.println();
//	}
	
//	@Test
//	public void getStudentByEmailId()
//	{
//		Student student=studentRepository.findByEmailId("b@b");
//		System.out.println();
//		System.out.println("student= "+student);
//		System.out.println();
//	}
	
	
//	@Test
//	public void getStudentByEmailId()
//	{
//		Student student=studentRepository.getStudentByEmailAddress("b@b");
//		System.out.println();
//		System.out.println("student= "+student);
//		System.out.println();
//	}
	
//	@Test
//	public void getStudentFirstNameByEmailId()
//	{
//		String firstName=studentRepository.getStudentFirstNameByEmailAddress("bingi@bingi");
//		System.out.println();
//		System.out.println("student= "+firstName);
//		System.out.println();
//	}
	
//	@Test
//	public void printgetStudentByEmailAddressNative()
//	{
//		Student student=studentRepository.getStudentByEmailAddressNative("bingi@bingi");
//		System.out.println();
//		System.out.println("student= "+student);
//		System.out.println();
//	}
//	
//	@Test
//	public void printgetStudentByEmailAddressNativeNamedParameter()
//	{
//		Student student=studentRepository.getStudentByEmailAddressNativeNamedParameter("bingi@bingi");	
//		System.out.println();
//		System.out.println("student= "+student);
//		System.out.println();
//	}
	
	@Test
	public void printupdateStudentNameByEmailId()
	{
		studentRepository.updateStudentNameByEmailId("vinay vinay", "vinay@vinay");
		
	}
}
