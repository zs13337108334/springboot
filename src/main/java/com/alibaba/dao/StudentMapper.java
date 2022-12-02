package com.alibaba.dao;


import com.alibaba.domain.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author zhangshuai
 */
@Mapper
@Repository
public interface StudentMapper {

    @Select("SELECT * FROM student WHERE id = #{id}")
    Student findById(int id);
}
