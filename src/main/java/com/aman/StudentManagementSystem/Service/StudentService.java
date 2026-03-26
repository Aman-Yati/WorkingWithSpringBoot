package com.aman.StudentManagementSystem.Service;

import com.aman.StudentManagementSystem.DTO.StudentDTO;


import java.util.List;

public interface StudentService {

     StudentDTO getStudentById(Long id);

    List<StudentDTO> getAllStudents();
}
