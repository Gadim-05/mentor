package com.example.mentor.requestDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookRequestDTO {
    private String title;
    private String author;
    private LocalDate publishedDate;
<<<<<<< HEAD
//    private Long studentId;
=======
    private Long studentId;
>>>>>>> f87d312a73f65d05db300721412dc7b7ebaa0649
}
