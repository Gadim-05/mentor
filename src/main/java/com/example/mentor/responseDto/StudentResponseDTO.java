package com.example.mentor.responseDto;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

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


    private List<BookResponseDTO> books;
    private Set<CourseResponseDTO> courses;
}
