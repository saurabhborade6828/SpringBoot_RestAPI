package org.jsp.Rest_Api.service;

import java.util.List;
import java.util.Optional;

import org.jsp.Rest_Api.dto.Student;
import org.jsp.Rest_Api.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService 
{
   @Autowired
   private StudentRepository studentRepository;
   
   // saving single student //
   public Student saveStudent(Student student)
   {
	   return studentRepository.save(student);
   }
   
   // saving multiple students //
   public String saveAllStudents(List<Student> students)
   {
	   List<Student> saveAll = studentRepository.saveAll(students);
	   return "Students saved in database";
   }
   
   // finding single student based on primary key //
   public Optional<Student> findStudentById(int id)
   {
	   return studentRepository.findById(id);
   }
   
   // finding single student based on name //
   public Optional<Student> findStudentByName(String name)
   {
	   return studentRepository.findByName(name);
   }
   
   // finding all students present in database //
   public List<Student> findAllStudents()
   {
	   return studentRepository.findAll();
   }
   
   //delete student based on id //
   public void deleteStudentById(int id)
   {
	   studentRepository.deleteById(id);
   }
   
   // updating the data //
   public Student updateById(Student student)
   {
	   Student student2 = studentRepository.findById(student.getId()).orElse(null);
	   student2.setName(student.getName());
	   student2.setEmail(student.getEmail());
	   student2.setAddress(student.getAddress());
	   return studentRepository.save(student2);
   }
   
   
}
