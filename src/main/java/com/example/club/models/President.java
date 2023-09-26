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
@Table(name = "presidente")
public class President extends Base{

    @Column(name = "apellido")
    private String lastName;
}
