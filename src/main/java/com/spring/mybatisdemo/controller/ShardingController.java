package com.spring.mybatisdemo.controller;

import com.spring.mybatisdemo.bean.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShardingController {

//    @Autowired
//    CourseMapper courseMapper;
//    @PostMapping("/save")
//    public void demoTestOne(){
//        for (int i = 0; i < 100; i++) {
//            Course course = new Course();
//            // DateUtil.yearOf(DateUtil.parse(getAddMonth(i))) 按月份自增i月后取出年份
////            course.setYear(DateUtil.yearOf(DateUtil.parse(getAddMonth(i))));
//            course.setUpdateTime(System.currentTimeMillis() + " ");
//            course.setCreateTime(System.currentTimeMillis() + " ");
//            courseMapper.insert(course);
//        }
//    }
}
