package com.alibaba.service.order.impl;

import com.alibaba.dao.StudentMapper;
import com.alibaba.domain.Student;
import com.alibaba.service.order.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}

