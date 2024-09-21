package com.example.mentor.service;

import com.example.mentor.Feign.IMDBFeignClient;
import com.example.mentor.requestDto.imdbDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class imdbService {
    private final IMDBFeignClient imdbFeignClient;

    private final String host = "imdb-top-100-movies.p.rapidapi.com/1";
    private final String key = "5a4e0b1dd2msh2f99ff17324a60dp16ddc1jsn52532e533a9b";


    public imdbDTO getPopularMovies() {
        return imdbFeignClient.getPopularMovies(host,key);

    }
}
