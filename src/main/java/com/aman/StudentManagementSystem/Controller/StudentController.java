package com.aman.StudentManagementSystem.Controller;

import com.aman.StudentManagementSystem.DTO.StudentDTO;
import com.aman.StudentManagementSystem.Service.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/student")
    public List<StudentDTO> getStudent(){

        return studentService.getAllStudents();
    }
    @GetMapping("/students/{id}")
    public StudentDTO getstudentbyid(@PathVariable Long id){
        return studentService.getStudentById(id);
    }

}
