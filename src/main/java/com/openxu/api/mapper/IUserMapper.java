package com.openxu.api.mapper;

import com.openxu.api.module.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Author: openXu
 * Time: 2022/5/3 23:27
 * class: IUserMapper
 * Description:
 */

@Mapper
public interface IUserMapper {


//        List<User> findAll();
//        void insert(User user);
//        void update(User user);
//        void delete(User user);
        @Select("select * from user")
        @Results({
                @Result(property = "id", column = "id"),
                @Result(property = "phone", column = "phone"),
                @Result(property = "password", column = "password"),
                @Result(property = "name", column = "name"),
                @Result(property = "sex", column = "sex"),
                @Result(property = "age", column = "age"),
                @Result(property = "occupation", column = "occupation"),
                @Result(property = "school", column = "school"),
                @Result(property = "school_name", column = "school_name"),
                @Result(property = "faculty", column = "faculty"),
                @Result(property = "faculty_name", column = "faculty_name"),
                @Result(property = "clazz", column = "clazz"),
                @Result(property = "clazz_name", column = "clazz_name"),
                @Result(property = "number", column = "number")
        })
        List<User> findAll();

        @Insert("insert into user(id, phone, password, name, sex, age, occupation, school, school_name, faculty, faculty_name, clazz, clazz_name, number) " +
                "VALUES (#{id},#{phone},#{password},#{name},#{sex},#{age},#{occupation},#{school},#{school_name},#{faculty},#{faculty_name},#{clazz}," +
                "#{clazz_name},#{number})")
        @SelectKey(statement = "select last_insert_id()", keyProperty = "id", before = false, resultType = Integer.class)
        void regist(User user);

//    @Select("select * from student where id = #{id}")
//    User regist(Integer id);
//
//
//    @Select("select * from student where id = #{id}")
//    User find(Integer id);

}
