package com.example.club.models;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;


@MappedSuperclass
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Base implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre")
    private String name;
}
