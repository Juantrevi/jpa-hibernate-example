package com.jpahibernate.ex.course.jpa;

import com.jpahibernate.ex.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepository {
    @Autowired
    private EntityManager entityManager;

    public void insert(Course course){
        entityManager.merge(course);
    }

    public Course findById(Long id){
        return entityManager.find(Course.class, id);
    }

    public void deleteById(Long id){
        Course course = findById(id);
        entityManager.remove(course);
    }

    public Course update(Course course){
        return entityManager.merge(course);
    }
}
