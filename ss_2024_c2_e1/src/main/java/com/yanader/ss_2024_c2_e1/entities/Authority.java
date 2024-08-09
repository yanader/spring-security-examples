package com.yanader.ss_2024_c2_e1.entities;

import jakarta.persistence.*;
import  lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name ="authorities")
@Getter
@Setter
public class Authority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @ManyToMany(mappedBy = "authorities")
    private Set<User> users;
}
