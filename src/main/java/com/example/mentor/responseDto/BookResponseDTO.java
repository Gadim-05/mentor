package com.example.mentor.responseDto;

import com.example.mentor.entity.Student;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookResponseDTO {
    private Long id;
    private String title;
    private String author;
    private LocalDate publishedDate;
<<<<<<< HEAD
//    private StudentResponseDTO student;
=======
    private StudentResponseDTO student;
>>>>>>> f87d312a73f65d05db300721412dc7b7ebaa0649
}
