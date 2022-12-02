package com.alibaba.dao;


import com.alibaba.domain.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author zhangshuai
 */
@Mapper
@Repository
public interface StudentMapper {

    @Select("SELECT * FROM student WHERE id = #{id}")
    Student findById(int id);

    @Select("SELECT * FROM student")
    List<Student> findAll();

    @Insert({ "insert into student (id,name,age) values(#{id},#{name},#{age})" })
    int addStudent(Student student);
}
