package com.example.mentor.repository;

import com.example.mentor.entity.Course;
import com.example.mentor.entity.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
@Repository

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByLastName(String lastName);
    List<Student> findByEmailContaining(String email);
    Optional<Student> findByEmail(String email);
    List<Student> findByFirstNameAndLastName(String firstName, String lastName);
    List<Student> findByDateOfBirthAfter(LocalDate date);
    List<Student> findByEmailEndingWith(String domain);
    List<Student> findByFirstNameIgnoreCase(String firstName);
    List<Student> findByDateOfBirthBefore(LocalDate date);
    List<Student> findByLastNameIn(List<String> lastNames);

//    List<Student> getStudentByCourseName(@Param("name")String name);

}
