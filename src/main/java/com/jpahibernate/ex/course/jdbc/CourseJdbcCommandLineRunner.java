package com.jpahibernate.ex.course.jdbc;

import com.jpahibernate.ex.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;

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
