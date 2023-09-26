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
@Table(name = "club")
public class club extends Base{

    @Column(name = "ciudad")
    private String city;

    @Column(name = "pais")
    private String country;
}
