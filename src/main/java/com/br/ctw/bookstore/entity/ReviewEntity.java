package com.br.ctw.bookstore.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "tb_review")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReviewEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false, length = 250)
    private String comment;

    @OneToOne
    @JoinColumn(name = "book_id")
    private BookEntity book;
}
