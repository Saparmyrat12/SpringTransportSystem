package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.AUTO;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "stops")
public class Stops implements java.io.Serializable {
    @Id
    @GeneratedValue(strategy = AUTO)
    @Column(name = "stop_id", unique = true, nullable = false)
    private Long stopId;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "address", nullable = false, length = 50)
    private String address;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "stops")
    private Set<RouteStops> routeStopses;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "stops")
    private Set<PlanOfStops> planOfStopses;

    public Stops() {
    }

    public Stops(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Stops(String name, String address, Set routeStopses, Set planOfStopses) {
        this.name = name;
        this.address = address;
        this.routeStopses = routeStopses;
        this.planOfStopses = planOfStopses;
    }

}
