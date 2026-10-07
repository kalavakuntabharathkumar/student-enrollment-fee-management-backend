package com.example.enrollment.entity;
import jakarta.persistence.*;
import java.time.LocalDate;
@Entity @Table(name="enrollments", indexes={@Index(name="idx_enrollment_student",columnList="student_id")})
public class Enrollment {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) Long id;
 @ManyToOne(optional=false) @JoinColumn(name="student_id") Student student;
 @ManyToOne(optional=false) @JoinColumn(name="course_id") Course course;
 @Column(nullable=false) LocalDate enrolledOn;
 @Column(nullable=false) String status;
 public Enrollment(){} public Enrollment(Student s,Course c){student=s;course=c;enrolledOn=LocalDate.now();status="ACTIVE";}
 public Long getId(){return id;} public Student getStudent(){return student;} public Course getCourse(){return course;}
 public LocalDate getEnrolledOn(){return enrolledOn;} public String getStatus(){return status;} public void setStatus(String v){status=v;}
}
