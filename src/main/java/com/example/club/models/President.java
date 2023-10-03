package com.example.club.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "presidente")
public class President extends Base {

    @Column(name = "apellido")
    private String lastName;

  //  @OneToOne(cascade = CascadeType.ALL)
  //  @JoinColumn(name = "fk_club")
  //  private Club club;

}
