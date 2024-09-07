package com.example.mentor.service;

import com.example.mentor.entity.Book;
import com.example.mentor.entity.Course;
import com.example.mentor.repository.BookRepository;
import com.example.mentor.repository.CourseRepository;
import com.example.mentor.requestDto.StudentRequestDTO;
import com.example.mentor.responseDto.StudentResponseDTO;
import com.example.mentor.entity.Student;
import com.example.mentor.exception.StudentNotFoundException;
import com.example.mentor.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    private final ModelMapper modelMapper;

    private final BookRepository bookRepository;
    private final CourseRepository courseRepository;



//    public StudentResponseDTO createStudent(StudentRequestDTO studentRequestDTO) {
//
//        Student s = modelMapper.map(studentRequestDTO, Student.class);
//        Student savedStudent = studentRepository.save(s);
//
//        return modelMapper.map(savedStudent, StudentResponseDTO.class);
//    }


    public StudentResponseDTO createStudent(StudentRequestDTO studentRequestDTO) {
        Student student = modelMapper.map(studentRequestDTO, Student.class);


        List<Book> studentBooks = studentRequestDTO.getBooksIds().stream()
                .map(id -> bookRepository.findById(id).orElseThrow())
                .collect(Collectors.toList());

        List<Course> studentCourses = studentRequestDTO.getCourseIds().stream()
                .map(id -> courseRepository.findById(id).orElseThrow())
                .collect(Collectors.toList());


        student.setBooks(studentBooks);
        student.setCourses(studentCourses);

        Student savedStudent = studentRepository.save(student);
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

