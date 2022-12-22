package com.springboot.db2.domain;

import javax.persistence.*;

/**
 * JPA Entity representing student
 */

@Entity
@Table(name = "STUDENT")
public class Student {
    @Id
    @Column
    private Integer studentId;

    @Column
    private String name;

    @Column
    private Integer age;

    public Student(Integer studentId, String name, Integer age) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
    }

    protected Student() {
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId() {
        this.studentId = studentId;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" + "studentId=" + studentId + ", name=" + name +
                ", age=" + age + "}\n";
    }
}

