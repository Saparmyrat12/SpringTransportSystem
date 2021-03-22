package com.example.demo.entity;
// Generated 20.03.2021 14:06:52 by Hibernate Tools 4.3.1

import javax.persistence.*;

import static javax.persistence.GenerationType.AUTO;

@Entity
@Table(name = "route_stops")
public class RouteStops implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = AUTO)
    @Column(name = "route_stops_id", unique = true, nullable = false)
    private int routeStopsId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "route_id", nullable = false)
    private Routes routes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stop_id", nullable = false)
    private Stops stops;

    @Column(name = "number", nullable = false)
    private int number;

    public RouteStops() {
    }

    public RouteStops(int routeStopsId, Routes routes, Stops stops, int number) {
        this.routeStopsId = routeStopsId;
        this.routes = routes;
        this.stops = stops;
        this.number = number;
    }
}
