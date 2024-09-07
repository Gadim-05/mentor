package com.example.mentor.requestDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.annotation.processing.Generated;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class EmailRequestDTO {

    private String to;
    private String subject;
    private String body;


}
