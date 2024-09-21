package com.example.mentor.responseDto;

import java.time.LocalDate;
<<<<<<< HEAD
import java.util.List;
import java.util.Set;
=======
>>>>>>> f87d312a73f65d05db300721412dc7b7ebaa0649

import lombok.*;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentResponseDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate dateOfBirth;
<<<<<<< HEAD


    private List<BookResponseDTO> books;
    private Set<CourseResponseDTO> courses;
=======
>>>>>>> f87d312a73f65d05db300721412dc7b7ebaa0649
}
