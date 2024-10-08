package com.example.mentor.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
@Getter
@Setter
@Table(name = "student_table")
@AllArgsConstructor
@NoArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String firstName;


    private String lastName;

    @Column(nullable = false, unique = true)
    private String email;


    private LocalDate dateOfBirth;


    @OneToOne
<<<<<<< HEAD
    @JsonIgnore
=======
>>>>>>> f87d312a73f65d05db300721412dc7b7ebaa0649
    @JoinColumn(name = "address_id")
    private Address address;

    @ManyToMany
<<<<<<< HEAD
    @JsonIgnore
=======
>>>>>>> f87d312a73f65d05db300721412dc7b7ebaa0649
    @JoinTable(
            name = "student_course",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id")
    )
    private List<Course> courses;

<<<<<<< HEAD
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
=======
    @OneToMany(mappedBy = "student",
            fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
>>>>>>> f87d312a73f65d05db300721412dc7b7ebaa0649
    @JsonIgnore
    private List<Book> books;


}