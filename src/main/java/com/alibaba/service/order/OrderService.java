package com.alibaba.service.order;


import com.alibaba.domain.Student;

import java.util.List;
import java.util.Map;

public interface OrderService {
    Student getStudentById(Integer id);
    Map<Integer, Student> getAllStudent();

    int addStudent();
}
