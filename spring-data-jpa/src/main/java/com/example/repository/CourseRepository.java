package com.example.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{
	public Page<Course> findByTitleContaining(String title,Pageable pagable);
}
