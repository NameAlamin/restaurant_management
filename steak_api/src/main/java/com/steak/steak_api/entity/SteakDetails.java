package com.steak.steak_api.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "steak_table")
public class SteakDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "steak_name")
    private String name;

    @Column(name = "steak_size")
    private String size;

    @Column(name = "steak_price")
    private Double price;
}
