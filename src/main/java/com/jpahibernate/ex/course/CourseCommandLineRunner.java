package com.jpahibernate.ex.course;

import com.jpahibernate.ex.course.Course;
import com.jpahibernate.ex.course.jdbc.CourseJdbcRepository;
import com.jpahibernate.ex.course.jpa.CourseJpaRepository;
import com.jpahibernate.ex.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

/*    @Autowired
    private CourseJdbcRepository repository;*/

/*    @Autowired
    private CourseJpaRepository repository;*/

    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(10001L, "Spring", "Ranga"));
        repository.save(new Course(10002L, "Spring Boot", "Ranga"));
        repository.save(new Course(10003L, "Spring", "Ranga"));
        repository.save(new Course(10004L, "Spring Rest", "Ranga"));
        repository.deleteById(10004L);
        System.out.println(repository.findById(10001L));
        System.out.println(repository.findById(10002L));
        System.out.println(repository.findAll());
        repository.findByAuthor("Ranga").forEach(System.out::println);
          repository.findByName("Spring").forEach(System.out::println);
    }
}
