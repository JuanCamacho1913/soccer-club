package com.example.club.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "entrenador")
public class TrainerDt extends Base{

    @Column(name = "apellido")
    private String lastName;

    @Column(name = "edad")
    private Integer age;
}
