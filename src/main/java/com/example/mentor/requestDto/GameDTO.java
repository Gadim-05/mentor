package com.example.mentor.requestDto;

import lombok.Data;

import java.util.ArrayList;
@Data
public class GameDTO {
    public int id;
    public String name;
    public ArrayList<String> genre;
    public ArrayList<String> developers;
    public ArrayList<String> publishers;
    public ReleaseDateDTO releaseDates;
}
