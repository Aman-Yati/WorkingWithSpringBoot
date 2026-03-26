package com.aman.StudentManagementSystem.Service.Impl;

import com.aman.StudentManagementSystem.DTO.StudentDTO;
import com.aman.StudentManagementSystem.Entity.Student;
import com.aman.StudentManagementSystem.Repository.StudentRepository;
import com.aman.StudentManagementSystem.Service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public StudentDTO getStudentById(Long id) {
        Student student = studentRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Student not found"));
        StudentDTO studentDto = new StudentDTO(student.getId(), student.getName(), student.getEmail());
        return studentDto;
    }

    @Override
    public List<StudentDTO> getAllStudents(){
        List<Student> students = studentRepository.findAll();
        List<StudentDTO> studentDtoList = students
                .stream()
                .map(student -> new StudentDTO(student.getId(),student.getName(), student.getEmail()))
                .toList();
        return List.of();
    }

}
