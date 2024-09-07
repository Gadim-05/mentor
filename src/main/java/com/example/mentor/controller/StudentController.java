package com.example.mentor.controller;
import com.example.mentor.requestDto.StudentRequestDTO;
import com.example.mentor.responseDto.StudentResponseDTO;
import com.example.mentor.exception.StudentNotFoundException;
import com.example.mentor.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {


    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping("/create")
    public StudentResponseDTO saveProduct(@RequestBody StudentRequestDTO studentRequestDTO){
       return studentService.createStudent(studentRequestDTO);
    }


    @GetMapping("/get-by-id/{studentId}")
    public StudentResponseDTO getById(@PathVariable Long studentId){
        return studentService.findById1(studentId);
    }


    @GetMapping("/get-all")
    public List<StudentResponseDTO> getAllStudents() {
       return studentService.getAllStudents();

    }

    @PutMapping("/update/{id}")
    public StudentResponseDTO updateStudent(@PathVariable Long id, @RequestBody StudentRequestDTO studentRequestDTO) {
        return studentService.updateStudent(id, studentRequestDTO);

    }

    @DeleteMapping("/delete/{id}")
    public String deleteStudentById(@PathVariable Long id) throws StudentNotFoundException {
        studentService.deleteStudentById(id);
        return "Successfully deleted";
    }


//    @GetMapping("/byCourse")
//    public List<Student> findStudentByCourseName(@RequestParam String name){
//        return studentService.findStudentByCourseName(name);
//    }

}