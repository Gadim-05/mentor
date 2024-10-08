package com.example.mentor.service;

<<<<<<< HEAD
import com.example.mentor.entity.Book;
import com.example.mentor.entity.Student;
import com.example.mentor.repository.StudentRepository;
import com.example.mentor.requestDto.BookRequestDTO;
=======
>>>>>>> f87d312a73f65d05db300721412dc7b7ebaa0649
import com.example.mentor.requestDto.CourseRequestDTO;
import com.example.mentor.responseDto.CourseResponseDTO;

import com.example.mentor.entity.Course;

import com.example.mentor.exception.CourseNotFoundException;

import com.example.mentor.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService {

<<<<<<< HEAD
    private final StudentRepository studentRepository;
=======

>>>>>>> f87d312a73f65d05db300721412dc7b7ebaa0649
    private final CourseRepository courseRepository;
    private final ModelMapper modelMapper;

    public String createCourse(CourseRequestDTO courseRequestDTO){

        Course course = modelMapper.map(courseRequestDTO, Course.class);

        courseRepository.save(course);

        return "Successfully created!!!";
    }

<<<<<<< HEAD


=======
>>>>>>> f87d312a73f65d05db300721412dc7b7ebaa0649
    public List<CourseResponseDTO> getAllCourses(){
        List<Course> all = courseRepository.findAll();

        List<CourseResponseDTO> list = all.stream()
                .map(a -> modelMapper.map(a, CourseResponseDTO.class))
                .toList();

        return list;
    }

    public CourseResponseDTO getCourseById(Long id){
        Course course = courseRepository.findById(id).orElseThrow(()->
                new CourseNotFoundException("Course not found with this id!!!"));

        CourseResponseDTO map = modelMapper.map(course, CourseResponseDTO.class);

        return map;
    }
<<<<<<< HEAD
    public CourseResponseDTO updateCourse(Long id, CourseRequestDTO courseRequestDTO) throws CourseNotFoundException {
        Course existingCourse = courseRepository.findById(id)
                .orElseThrow(() -> new CourseNotFoundException("Course not found with id " + id));

        modelMapper.map(courseRequestDTO, existingCourse);
        Course updatedCourse = courseRepository.save(existingCourse);

        return modelMapper.map(updatedCourse, CourseResponseDTO.class);
    }

    public void deleteCourseById(Long id) throws CourseNotFoundException {
        if (!courseRepository.existsById(id)) {
            throw new CourseNotFoundException("Course not found with id " + id);
        }
        courseRepository.deleteById(id);
    }
=======

>>>>>>> f87d312a73f65d05db300721412dc7b7ebaa0649
}
