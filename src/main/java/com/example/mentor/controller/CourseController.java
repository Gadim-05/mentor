package com.example.mentor.controller;

import com.example.mentor.requestDto.CourseRequestDTO;
import com.example.mentor.responseDto.CourseResponseDTO;
import com.example.mentor.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courses")
@RequiredArgsConstructor
public class CourseController {
    private final CourseService courseService;
    @PostMapping("/create")
    public String createCourse(@RequestBody CourseRequestDTO courseRequestDTO){
        courseService.createCourse(courseRequestDTO);
        return "Successfully created";
    }

    @GetMapping("/get-all")
    public List<CourseResponseDTO> getALlCourses(){
        return courseService.getAllCourses();
    }

    @GetMapping("/get-by-id/{id}")
    public CourseResponseDTO getById(@PathVariable Long id){
        return courseService.getCourseById(id);
    }

}
