package com.example.mentor.controller;

import com.example.mentor.requestDto.EmailRequestDTO;
import com.example.mentor.service.EmailService;
import io.swagger.v3.oas.annotations.Parameter;
import jakarta.mail.MessagingException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class EmailController {
//
//    private final EmailService emailService;
//
//    @PostMapping("/simple-email")
//    public String sendEmail(@RequestBody EmailRequestDTO emailRequestDTO) {
//            emailService.sendEmail(emailRequestDTO);
//            return "Email sent successfully!";
//
//
//    }
////    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
////    public String sendMultipart(@RequestBody EmailRequestDTO emailRequestDTO,
////                                @Parameter(description = "file to upload")
////                                @RequestPart(value = "files",required = true)
////        MultipartFile file) throws MessagingException{
////
////
////        return emailService.sendMimeMessage(emailRequestDTO, file);
////
////
////    }
//
//    @PostMapping(value = "/send-mail-with-attachment", consumes = {"multipart/form-data"})
//    public String sendEmailWithAttachment(
//            @RequestPart("to") String to,
//            @RequestPart("subject") String subject,
//            @RequestPart("body") String body,
//            @RequestPart(value = "files", required = true) List<MultipartFile> files) throws MessagingException {
//
//        EmailRequestDTO emailRequestDTO = new EmailRequestDTO(to, subject, body);
//        return emailService.sendMimeMessage(emailRequestDTO, files);
//    }
}
