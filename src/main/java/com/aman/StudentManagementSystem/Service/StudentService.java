package com.aman.StudentManagementSystem.Service;

import com.aman.StudentManagementSystem.DTO.AddStudentRequestDTO;
import com.aman.StudentManagementSystem.DTO.StudentDTO;
import org.jspecify.annotations.Nullable;


import java.util.List;

public interface StudentService {

     StudentDTO getStudentById(Long id);

    List<StudentDTO> getAllStudents();

    @Nullable StudentDTO createNewStudent(AddStudentRequestDTO addStudentRequestDTO);
}
