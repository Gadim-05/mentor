package com.example.mentor.controller;

import com.example.mentor.requestDto.imdbDTO;
import com.example.mentor.service.imdbService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class imdbController {

    private final imdbService service;

    @GetMapping("/imdb")
    public imdbDTO getMovies(){
         return service.getPopularMovies();




    }

}
