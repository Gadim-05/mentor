package com.example.mentor.requestDto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class imdbDTO {
    public int rank;
    public String title;
    public String description;
    public String image;
    public String big_image;
    public ArrayList<String> genre;
    public String thumbnail;
    public String rating;
    public String id;
    public int year;
    public String imdbid;
    public String imdb_link;
}
