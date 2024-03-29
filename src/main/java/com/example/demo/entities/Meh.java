package com.example.demo.entities;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Meh {

    @Id
    @GeneratedValue
    private Long id;

    private String value;
}
