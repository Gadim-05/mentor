package com.example.mentor.service;

import com.example.mentor.requestDto.StudentRequestDTO;
import com.example.mentor.responseDto.StudentResponseDTO;
import com.example.mentor.entity.Student;
import com.example.mentor.exception.StudentNotFoundException;
import com.example.mentor.repository.StudentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    private final ModelMapper modelMapper;

    public StudentService(StudentRepository studentRepository, ModelMapper modelMapper) {
        this.studentRepository = studentRepository;
        this.modelMapper = modelMapper;
    }

    public StudentResponseDTO createStudent(StudentRequestDTO studentRequestDTO) {

        Student s = modelMapper.map(studentRequestDTO, Student.class);
        Student savedStudent = studentRepository.save(s);

        return modelMapper.map(savedStudent, StudentResponseDTO.class);
    }


        public List<StudentResponseDTO> getAllStudents () {
            List<Student> all = studentRepository.findAll();

            List<StudentResponseDTO> list = all.stream()
                    .map(a -> modelMapper.map(a, StudentResponseDTO.class))
                    .toList();

          return list;

        }

        public StudentResponseDTO findById1(Long studentId) {

            Student student = studentRepository.findById(studentId).orElseThrow(()->
                    new StudentNotFoundException("Student not found with this id!!!"));

            StudentResponseDTO map = modelMapper.map(student, StudentResponseDTO.class);

            return map;

        }

        public StudentResponseDTO updateStudent (Long id, StudentRequestDTO studentRequestDTO){
            Student student = studentRepository.findById(id).orElseThrow();
            modelMapper.map(studentRequestDTO, student);

            Student updatedStudent = studentRepository.save(student);

            return modelMapper.map(updatedStudent, StudentResponseDTO.class);
        }

        public String deleteStudentById (Long id){
            if (!studentRepository.existsById(id)) {
                throw new StudentNotFoundException("Student not found with id: " + id);
            }
            studentRepository.deleteById(id);

            return "Successfully deleted";
        }

//        public List<Student> findStudentByCourseName(String name){
//        return studentRepository.getStudentByCourseName(name);
//        }


    }

