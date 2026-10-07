package com.example.enrollment.entity;
import jakarta.persistence.*;
import java.math.BigDecimal;
@Entity @Table(name="fees", indexes={@Index(name="idx_fee_student",columnList="student_id")})
public class Fee {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) Long id;
 @ManyToOne(optional=false) @JoinColumn(name="student_id") Student student;
 @Column(nullable=false,precision=12,scale=2) BigDecimal amount;
 @Column(nullable=false) String status;
 public Fee(){} public Fee(Student s,BigDecimal a){student=s;amount=a;status="PENDING";}
 public Long getId(){return id;} public Student getStudent(){return student;} public BigDecimal getAmount(){return amount;}
 public String getStatus(){return status;} public void setStatus(String v){status=v;}
}
