package com.aman.StudentManagementSystem.Controller;

import com.aman.StudentManagementSystem.DTO.StudentDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping("/student")
    public StudentDTO getStudent(){
        return new StudentDTO(01,"Aman Yati","amanyati@gmail.com");
    }

}
