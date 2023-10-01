package com.example.club.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "jugador")
public class Players extends Base{

    @Column(name = "apellido")
    private String lastName;

    @Column(name = "edad")
    private Integer age;

    @Column(name = "pie_habil")
    private String foot;

    @Column(name = "numero_camiseta")
    private Integer number;

    @ManyToOne
    @JoinColumn(name = "fk_club")
    private Club club;

}


