package com.example.enrollment.service;
import com.example.enrollment.entity.Student;
import com.example.enrollment.repository.StudentRepository;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class StudentService {
 private final StudentRepository repo;
 public StudentService(StudentRepository repo){this.repo=repo;}
 public List<Student> all(){return repo.findAll();}
 public Student get(Long id){return repo.findById(id).orElseThrow();}
 public Student save(Student s){return repo.save(s);}
 public Student update(Long id,Student s){Student x=get(id);x.setName(s.getName());x.setEmail(s.getEmail());x.setPhone(s.getPhone());return repo.save(x);}
 public void delete(Long id){repo.deleteById(id);}
}
