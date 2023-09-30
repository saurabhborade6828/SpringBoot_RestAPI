package org.jsp.Rest_Api.controller;

import java.util.List;
import java.util.Optional;

import org.jsp.Rest_Api.dto.Student;
import org.jsp.Rest_Api.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController 
{
   @Autowired
   private StudentService studentService;
   
   @PostMapping("/saveStudent")
   public Student addStudent(@RequestBody Student student)
   {
	   return studentService.saveStudent(student);
   }
   
   @PostMapping("/saveStudents")
   public String addAllStudent(@RequestBody List<Student> students)
   {
	   String saveAllStudents = studentService.saveAllStudents(students);
	   return "Students added successfully";
   }
   
   @GetMapping("/getStudentById/{id}")
   public Optional<Student> getStudentById(@PathVariable int id)
   {
	   return studentService.findStudentById(id);
   }
   
   @GetMapping("/getStudentByName/{name}")
   public Optional<Student> getStudentByName(@PathVariable String name)
   {
	   return studentService.findStudentByName(name);
   }
   
   @GetMapping("/getStudents")
   public List<Student> findAllStudents()
   {
	   return studentService.findAllStudents();
   }
   
   @DeleteMapping("/deleteStudentById/{id}")
   public void deleteStudent(@PathVariable int id)
   {
	   studentService.deleteStudentById(id);
   }
   
   @PutMapping("/update")
   public Student updateStudent(@RequestBody Student student)
   {
	   return studentService.updateById(student);
   }
   
   
}
