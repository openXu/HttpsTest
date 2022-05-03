package com.openxu.api.module;

/**
 * Author: openXu
 * Time: 2020/11/18 10:16
 * class: User
 * Description:
 */
//告知通用Mapper要对哪张表进行操作
public class User {
    public int id    ;//主键自增',
    public String phone;   //'手机',
    public String password;   //'密码',
    public String name;   //'姓名',
    public int sex;    //'性别0女，1男',
    public int age;    //'年龄',
    public int occupation;   //'职业，0学生，1管理员',
    public int school;    //'学校(外键：organize)',
    public String school_name;    //'学校',
    public int faculty;    //'院系(外键：organize)',
    public String faculty_name;    //'院系',
    public int clazz;    //'班级(外键：organize)',
    public String clazz_name;    //'班级',
    public String number;  //学号',

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getOccupation() {
        return occupation;
    }

    public void setOccupation(int occupation) {
        this.occupation = occupation;
    }

    public int getSchool() {
        return school;
    }

    public void setSchool(int school) {
        this.school = school;
    }

    public String getSchool_name() {
        return school_name;
    }

    public void setSchool_name(String school_name) {
        this.school_name = school_name;
    }

    public int getFaculty() {
        return faculty;
    }

    public void setFaculty(int faculty) {
        this.faculty = faculty;
    }

    public String getFaculty_name() {
        return faculty_name;
    }

    public void setFaculty_name(String faculty_name) {
        this.faculty_name = faculty_name;
    }

    public int getClazz() {
        return clazz;
    }

    public void setClazz(int clazz) {
        this.clazz = clazz;
    }

    public String getClazz_name() {
        return clazz_name;
    }

    public void setClazz_name(String clazz_name) {
        this.clazz_name = clazz_name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
