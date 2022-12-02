package com.alibaba.service.order.impl;

import com.alibaba.dao.StudentMapper;
import com.alibaba.domain.Student;
import com.alibaba.domain.StudentBase;
import com.alibaba.service.order.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author zhangshuai
 * @date 2022/12/01
 */
@Slf4j
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public Student getStudentById(Integer id) {
        return studentMapper.findById(id);
    }

    @Override
    public Map<Integer, Student> getAllStudent() {
        List<Student> studentList = studentMapper.findAll();
        studentList.stream().filter(Objects::nonNull).map(StudentBase::getId);
        Map<Integer, Student> map = studentList.stream().filter(Objects::nonNull).collect(Collectors.toMap(o -> o.getId(), Function.identity()));
        return map;
    }

    @Override
    public int addStudent() {
        Student student = new Student();
        student.setAge("27");
        student.setName("张帅");
        return studentMapper.addStudent(student);
    }
}

