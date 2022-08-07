package com.burger.burger_api.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "burger_list")
public class BurgerDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "Burger_Name")
    private String name;

    @Column(name = "Burger_Size")
    private String size;

    @Column(name = "Burger_Price")
    private Double price;
}
