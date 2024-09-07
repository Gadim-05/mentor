package com.example.mentor.service;

import com.example.mentor.Feign.GamesFeignClient;
import com.example.mentor.requestDto.GameDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GameService {

    private final GamesFeignClient gamesFeignClient;
@Scheduled(fixedDelay = 10000)
    public void getGames() {
    List<GameDTO> games = gamesFeignClient.getGames();

    for (GameDTO gameDTO : games) {
        System.out.println(gameDTO.getDevelopers());
        System.out.println("------------------------------------");
    }


}
}
