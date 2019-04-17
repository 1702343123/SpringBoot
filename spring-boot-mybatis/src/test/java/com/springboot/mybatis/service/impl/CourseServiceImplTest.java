package com.springboot.mybatis.service.impl;

import com.springboot.mybatis.entity.Course;
import com.springboot.mybatis.service.CourseService;
import com.springboot.mybatis.util.RandomUntil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseServiceImplTest {
    @Resource
    private CourseService courseService;

    @Test
    public void selectAll() {
        List<Course> courseList = courseService.selectAll();
        courseList.forEach(course -> System.out.println(course));
    }

    @Test
    public void getOne() {
        Course course = courseService.getOne(1L);
        System.out.println(course);
    }

    @Test
    public void delete() {
        courseService.delete(4L);
    }

    @Test
    public void insert() {
        Course course = new Course();
        course.setCourseName("微信小程序开发");
        course.setCourseClass("软件1721");
        course.setUserId(1L);
        course.setCover("1.jpg");
        course.setCourseCode(RandomUntil.getRandomCode());
        course.setFinished((short) 0);
        courseService.insert(course);
    }

    @Test
    public void update() {
        Course course = courseService.getOne(3L);
        course.setCover("999.jpg");
        course.setFinished((short) 1);
        courseService.update(course);
    }

//    @Test
//    public void insert()throws Exception{
//        Course  course=new Course();
//        course.setCourseName("测试课程");
//        course.setUserId(3L);
//        course.setCourseClass("软件1721");
//        course.setCover("banke.png");
//        course.setCourseCode(RandomUntil.getRandomCode());
//        course.setFinished((short) 0);
//        courseService.insert(course);
//    }
//
//    @Test
//    public void update(){
//        Course course=courseService.getOne(5L);
//        course.setCover("banke.png");
//        course.setFinished((short) 1);
//        courseService.update(course);
//    }
//
//    @Resource
//    private CourseService courseService;
//    @Test
//    public void selectAll() throws Exception {
//        List<Course> courseList=courseService.selectAll();
//        courseList.forEach(course -> System.out.println(course));
//    }
//    @Test
//    public void getOne() {
//       Course course=courseService.getOne(1L);
//        System.out.println(course);
//    }
//
//    @Test
//    public void delete() throws Exception {
//        courseService.delete(5L);
//    }
}