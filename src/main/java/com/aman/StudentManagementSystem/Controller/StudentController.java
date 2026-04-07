package com.aman.StudentManagementSystem.Controller;

import com.aman.StudentManagementSystem.DTO.AddStudentRequestDTO;
import com.aman.StudentManagementSystem.DTO.StudentDTO;
import com.aman.StudentManagementSystem.Service.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping("/student")
    public ResponseEntity<List<StudentDTO>> getStudent(){

        return ResponseEntity.ok(studentService.getAllStudents());
    }
    @GetMapping("/students/{id}")
    public ResponseEntity<StudentDTO> getstudentbyid(@PathVariable Long id){
        return ResponseEntity.ok(studentService.getStudentById(id));
    }

    @PostMapping
    public ResponseEntity<StudentDTO> createNewStudent(@RequestBody AddStudentRequestDTO addStudentRequestDTO){

    return ResponseEntity.status(HttpStatus.CREATED).body(studentService.createNewStudent(addStudentRequestDTO));
    }


}