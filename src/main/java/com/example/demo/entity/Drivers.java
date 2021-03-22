package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.GenerationType.AUTO;

@Getter
@Setter
@Entity
@Table(name = "drivers")
public class Drivers implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = AUTO)
    @Column(name = "driver_id", unique = true, nullable = false)
    private Long driverId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "route_id", nullable = false)
    private Routes routes;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "surname", nullable = false, length = 50)
    private String surname;

    @Column(name = "age", nullable = false)
    private int age;

    public Drivers() {
    }

    public Drivers(Long driverId, Routes routes, String name, String surname, int age) {
        this.driverId = driverId;
        this.routes = routes;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Drivers(Long driverId, String name, String surname, int age) {
        this.driverId = driverId;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
}
