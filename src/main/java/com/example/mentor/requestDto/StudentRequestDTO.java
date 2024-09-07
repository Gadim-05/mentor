package com.example.mentor.requestDto;

import lombok.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentRequestDTO {


    private String firstName;
    private String lastName;
    private String email;
    private LocalDate dateOfBirth;

    private List<Long> booksIds;
    private Set<Long> courseIds;
}
