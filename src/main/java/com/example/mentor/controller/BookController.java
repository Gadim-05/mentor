package com.example.mentor.controller;

import com.example.mentor.entity.Book;
import com.example.mentor.requestDto.BookRequestDTO;
import com.example.mentor.responseDto.BookResponseDTO;
import com.example.mentor.service.BookService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    @PostMapping("/create")
    public String createBook(@RequestBody BookRequestDTO bookRequestDTO){
        bookService.createBook(bookRequestDTO);
        return "Successfully created";
    }

    @GetMapping("/get-all")
    public List<BookResponseDTO> getAllBooks(){
        return bookService.getAllBooks();
    }


    @GetMapping("/getBooks/{studentId}")
    public BookResponseDTO getBooksByStudentId(@PathVariable Long studentId){
        return bookService.getBooksByStudentId(studentId);
    }





}
