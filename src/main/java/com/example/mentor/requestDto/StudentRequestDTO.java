package com.example.mentor.requestDto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentRequestDTO {


    private String firstName;
    private String lastName;
    private String email;
    private LocalDate dateOfBirth;


}
