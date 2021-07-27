package com.example.demo.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Club {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String Nom;
    private String nomPresident;

}
