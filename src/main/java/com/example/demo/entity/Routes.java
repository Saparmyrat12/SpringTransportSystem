package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.AUTO;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "routes")
public class Routes implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = AUTO)
    @Column(name = "route_id", unique = true, nullable = false)
    private Long routeId;

    @Column(name = "name", nullable = false, length = 20)
    private String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "routes")
    private Set<RouteStops> routeStopses;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "routes")
    private Set<Drivers> driverses;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "routes")
    private Set<Plans> planses;

    public Routes() {
    }

    public Routes(String name) {
        this.name = name;
    }

    public Routes(String name, Set<RouteStops> routeStopses, Set<Drivers> driverses, Set<Plans> planses) {
        this.name = name;
        this.routeStopses = routeStopses;
        this.driverses = driverses;
        this.planses = planses;
    }

}
