package com.example.mentor.Feign;

import com.example.mentor.requestDto.GameDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "example-service", url = "https://api.sampleapis.com/switch")
public interface GamesFeignClient {
    @GetMapping("/games")
    List<GameDTO> getGames();
}
