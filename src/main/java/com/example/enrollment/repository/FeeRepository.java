package com.example.enrollment.repository;
import com.example.enrollment.entity.Fee;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
public interface FeeRepository extends JpaRepository<Fee,Long>{List<Fee> findByStudentId(Long studentId);}
