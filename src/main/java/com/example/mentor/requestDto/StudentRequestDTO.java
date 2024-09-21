package com.example.mentor.requestDto;

import lombok.*;

import java.time.LocalDate;
<<<<<<< HEAD
import java.util.List;
import java.util.Set;
=======
>>>>>>> f87d312a73f65d05db300721412dc7b7ebaa0649

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentRequestDTO {


    private String firstName;
    private String lastName;
    private String email;
    private LocalDate dateOfBirth;

<<<<<<< HEAD
    private List<Long> booksIds;
    private Set<Long> courseIds;
=======

>>>>>>> f87d312a73f65d05db300721412dc7b7ebaa0649
}
