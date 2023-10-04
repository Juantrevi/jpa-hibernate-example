package com.jpahibernate.ex.course.springdatajpa;

import com.jpahibernate.ex.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {

    List<Course>findByAuthor(String author);
    List<Course>findByName(String name);

    List<Course>findAllByAuthorContainingIgnoreCase(String author);

    List<Course>findCourseByNameContainingIgnoreCase(String name);
}
