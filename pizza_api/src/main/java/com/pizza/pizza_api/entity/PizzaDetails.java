package com.pizza.pizza_api.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "piza_table")
public class PizzaDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "pizza_name")
    private String name;

    @Column(name = "pizza_size")
    private String size;

    @Column(name = "pizza_price")
    private Double price;
}
