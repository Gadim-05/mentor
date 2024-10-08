package com.example.mentor.controller;

<<<<<<< HEAD
import com.example.mentor.exception.CourseNotFoundException;
=======
>>>>>>> f87d312a73f65d05db300721412dc7b7ebaa0649
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

<<<<<<< HEAD

    @PutMapping("/update/{id}")
    public CourseResponseDTO updateCourse(@PathVariable Long id, @RequestBody CourseRequestDTO courseRequestDTO) throws CourseNotFoundException {
        return courseService.updateCourse(id, courseRequestDTO);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCourseById(@PathVariable Long id) throws CourseNotFoundException {
        courseService.deleteCourseById(id);
    }
=======
>>>>>>> f87d312a73f65d05db300721412dc7b7ebaa0649
}
