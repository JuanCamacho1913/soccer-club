package com.example.club.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "club")
public class Club extends Base{

    @Column(name = "ciudad")
    private String city;

    @Column(name = "pais")
    private String country;

    @Column(name = "estadio")
    private String stadium;

    @OneToMany(cascade = CascadeType.REFRESH, orphanRemoval = true)                                                    //El FetchType.LAZY es para que no sobrecargue la lista cuando tenga un creador, solo se va a poblar la lista cuando yo la necesite utilizar
    private List<Players> playersList = new ArrayList<>();                                                                                 //El orphanRemoval = true si se elimina un club automaticamnete se eliminaran los jugadores que esten alli

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_presidente")
    private President president;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_dt")
    private TrainerDt trainerDt;

}
