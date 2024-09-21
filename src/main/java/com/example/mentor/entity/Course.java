package com.example.mentor.entity;

<<<<<<< HEAD
import com.fasterxml.jackson.annotation.JsonIgnore;
=======
>>>>>>> f87d312a73f65d05db300721412dc7b7ebaa0649
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "course_table")
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;

    @ManyToMany(mappedBy = "courses")
<<<<<<< HEAD
    
    @JsonIgnore
    private List<Student> students;


=======
    private List<Student> students;
>>>>>>> f87d312a73f65d05db300721412dc7b7ebaa0649
}
