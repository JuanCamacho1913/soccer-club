package com.example.club.models;

import jakarta.persistence.*;
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

    @Column(name = "asistente_tecnico")
    private String technicalAssistant;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_club")
    private Club club;
}
