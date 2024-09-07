package com.example.mentor.service;

import com.example.mentor.requestDto.EmailRequestDTO;
import jakarta.mail.MessagingException;
import jakarta.mail.Multipart;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmailService {

    @Value("${mail}")
    private String from;


    private final JavaMailSender javaMailSender;

//   public String sendEmail(EmailRequestDTO emailRequestDTO) {
//        SimpleMailMessage msg = new SimpleMailMessage();
//        msg.setTo(emailRequestDTO.getTo());
//        msg.setFrom(from);
//        msg.setSubject(emailRequestDTO.getSubject());
//        msg.setText(emailRequestDTO.getBody());
//        javaMailSender.send(msg);
//        return "Email Sent";
//    }
//
//
//    public String sendMimeMessage(EmailRequestDTO emailRequestDTO, MultipartFile multipartFile) throws MessagingException {
//       MimeMessage mimeMessage = javaMailSender.createMimeMessage();
//        MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
//
//        mimeMessageHelper.setFrom(from);
//        mimeMessageHelper.setTo(emailRequestDTO.getTo());
//        mimeMessageHelper.setSubject(emailRequestDTO.getSubject());
//        mimeMessageHelper.setText(emailRequestDTO.getBody());
//
//       String originalFileName =  multipartFile.getOriginalFilename();
//
//       mimeMessageHelper.addAttachment(originalFileName, multipartFile);
//
//       javaMailSender.send(mimeMessage);
//
//       return "Email Sent";
//    }

//@Scheduled(fixedDelay = 5000)
//    @Scheduled(cron = "0 0 12 ? * MON-FRI")
//    public void sendEmail(EmailRequestDTO emailRequestDTO) {
//        SimpleMailMessage message = new SimpleMailMessage();
//        message.setFrom(from);
//        message.setTo(emailRequestDTO.getTo());
//        message.setText(emailRequestDTO.getBody());
//        message.setSubject(emailRequestDTO.getSubject());
//
//        javaMailSender.send(message);
//    }
//
//
//    public String sendMimeMessage(EmailRequestDTO emailRequestDTO, List<MultipartFile> multipartFile) throws MessagingException {
//        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
//
//        MimeMessageHelper messageHelper = new MimeMessageHelper(mimeMessage, true);
//        messageHelper.setFrom(from);
//        if (emailRequestDTO.getTo() == null || emailRequestDTO.getTo().isEmpty()) {
//            throw new IllegalArgumentException("To address must not be null or empty");
//        }
//        messageHelper.setTo(emailRequestDTO.getTo());
//        messageHelper.setText(emailRequestDTO.getBody());
//        messageHelper.setSubject(emailRequestDTO.getSubject());
//
//        for (MultipartFile file : multipartFile) {
//            String originalFilename = file.getOriginalFilename();
//            messageHelper.addAttachment(originalFilename, file);
//        }
//
//        javaMailSender.send(mimeMessage);
//
//        return "Successfully";
//    }

}
