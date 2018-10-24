package com.test6.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String>{


//public interface CourseRepository extends JpaRepository<Course, String> {
    public List<Course> findByTopicId(String topicId);

}
