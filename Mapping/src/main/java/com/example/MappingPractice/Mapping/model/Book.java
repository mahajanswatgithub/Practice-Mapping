package com.example.MappingPractice.Mapping.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "books")
public class Book {

    @Id
    @NotEmpty
    private String bookId;

    private String bookTitle;
    private String bookAuthor;
    private String bookDescription;
    private String bookPrice;

    //unidirectional
    @ManyToOne
    @JoinColumn(name = "fk_Student_id")
    private Student student;
}
