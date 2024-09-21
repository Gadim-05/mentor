package com.example.mentor.Feign;

import com.example.mentor.requestDto.GameDTO;
import com.example.mentor.requestDto.imdbDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;

@FeignClient(name = "imdb-service", url = "https://imdb-top-100-movies.p.rapidapi.com")
public interface IMDBFeignClient {
    @GetMapping
   imdbDTO getPopularMovies(@RequestHeader("x-rapidapi-host") String host,
                                  @RequestHeader("x-rapidapi-key") String key);
}
