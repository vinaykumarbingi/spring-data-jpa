package com.example.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
	
	public List<Student> findByFirstName(String firstName);
	public List<Student> findByFirstNameContaining(String name);
	public List<Student> findByLastNameNotNull();
	public List<Student> findByGuardianName(String name);
	
	@Query("select s from Student s where s.emailId = ?1")
	public Student getStudentByEmailAddress(String emailId);
	
	public Student findByEmailId(String emailId);
	
//	JPQL
	@Query("select s.firstName from Student s where s.emailId = ?1")
	public String getStudentFirstNameByEmailAddress(String emailId);
	
//	NativeQuery
	@Query(
			value = "SELECT * FROM tbl_student  where email_address=?",
			nativeQuery = true
			)
	public Student getStudentByEmailAddressNative(String emailId);
	
	
//	NativeQueryNamedParameter
	@Query(
			value = "SELECT * FROM tbl_student  where email_address=:emailId",
			nativeQuery = true
			)
	public Student getStudentByEmailAddressNativeNamedParameter(@Param("emailId") String emailId);
	
	@Modifying
	@Transactional
	@Query(
			value="update tbl_student set first_name=?1 where email_address=?2",
			nativeQuery = true
			)
	public int updateStudentNameByEmailId(String firstName, String emailId);
}
