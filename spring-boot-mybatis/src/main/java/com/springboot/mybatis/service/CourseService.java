package com.springboot.mybatis.service;

import com.springboot.mybatis.entity.Course;

import java.util.List;

/**
 * Created by 94921 on 2019/3/18.
 */
public interface CourseService {
    List<Course> selectAll();
    Course getOne(long courseId);
    void delete(long courseId);
    void insert(Course course);
    void update(Course course);
}
