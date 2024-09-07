package com.example.mentor.repository;

import com.example.mentor.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
   Book findBookByStudentId(Long studentId);
}
