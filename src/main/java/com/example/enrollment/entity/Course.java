package com.example.enrollment.entity;
import jakarta.persistence.*;
@Entity @Table(name="courses", indexes={@Index(name="idx_course_code",columnList="code",unique=true)})
public class Course {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) Long id;
 @Column(nullable=false,unique=true) String code;
 @Column(nullable=false) String name;
 public Course(){} public Course(String code,String name){this.code=code;this.name=name;}
 public Long getId(){return id;} public String getCode(){return code;} public void setCode(String v){code=v;}
 public String getName(){return name;} public void setName(String v){name=v;}
}
