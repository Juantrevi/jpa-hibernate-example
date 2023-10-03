package com.jpahibernate.ex.course;

import com.jpahibernate.ex.course.Course;
import com.jpahibernate.ex.course.jdbc.CourseJdbcRepository;
import com.jpahibernate.ex.course.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

/*    @Autowired
    private CourseJdbcRepository repository;*/

    @Autowired
    private CourseJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(10001L, "Spring", "Ranga"));
        repository.insert(new Course(10002L, "Spring Boot", "Ranga"));
        repository.insert(new Course(10003L, "Spring MVC", "Ranga"));
        repository.insert(new Course(10004L, "Spring Rest", "Ranga"));
        repository.deleteById(10004L);
        System.out.println(repository.findById(10001L));
    }
}
