package com.example.mentor.service;

import com.example.mentor.entity.Student;
import com.example.mentor.repository.StudentRepository;
import com.example.mentor.requestDto.BookRequestDTO;
import com.example.mentor.responseDto.BookResponseDTO;
import com.example.mentor.entity.Book;
import com.example.mentor.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class BookService {
    private final StudentRepository studentRepository;
    private final BookRepository bookRepository;
    private final ModelMapper modelMapper;


    public String createBook(BookRequestDTO bookRequestDTO){
        Book book = modelMapper.map(bookRequestDTO,Book.class);
        Student student = studentRepository.findById(bookRequestDTO.getStudentId()).orElseThrow();
        book.setStudent(student);
        bookRepository.save(book);
        return "successfully created";
    }

    public List<BookResponseDTO> getAllBooks(){
        List<Book> all = bookRepository.findAll();
        List<BookResponseDTO> list = all.stream()
                .map(a-> modelMapper.map(a, BookResponseDTO.class))
                .toList();
        return list;

    }

    public BookResponseDTO getBooksByStudentId(Long studentId){
       Book book = bookRepository.findBookByStudentId(studentId);


        BookResponseDTO map = modelMapper.map(book,BookResponseDTO.class);
        return map;

    }






}
