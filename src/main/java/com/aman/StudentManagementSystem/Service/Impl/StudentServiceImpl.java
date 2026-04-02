package com.aman.StudentManagementSystem.Service.Impl;

import com.aman.StudentManagementSystem.DTO.StudentDTO;
import com.aman.StudentManagementSystem.Entity.Student;
import com.aman.StudentManagementSystem.Repository.StudentRepository;
import com.aman.StudentManagementSystem.Service.StudentService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final ModelMapper modelMapper;


    @Override
    public StudentDTO getStudentById(Long id) {
        Student student = studentRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Student not found"));
        return modelMapper.map(student, StudentDTO.class);

    }

    @Override
    public List<StudentDTO> getAllStudents(){
        List<Student> students = studentRepository.findAll();
        List<StudentDTO> studentDtoList = students
                .stream()
                .map(student ->modelMapper.map(student, StudentDTO.class))
                .toList();
        return List.of();
    }

}
