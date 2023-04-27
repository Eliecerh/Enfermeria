package com.example.enfermeria.modelos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "car")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarModelo {
    @Id
    private int id;
    private String brand;
    private int model;
    private int category_id;

}
