package com.example.mentor.service;

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


    private final CourseRepository courseRepository;
    private final ModelMapper modelMapper;

    public String createCourse(CourseRequestDTO courseRequestDTO){

        Course course = modelMapper.map(courseRequestDTO, Course.class);

        courseRepository.save(course);

        return "Successfully created!!!";
    }

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

}
