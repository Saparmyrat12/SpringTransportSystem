package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

import static javax.persistence.GenerationType.AUTO;

@Getter
@Setter
@Entity
@Table(name = "plans")
public class Plans implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = AUTO)
    @Column(name = "plan_id", unique = true, nullable = false)
    private int planId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "route_id", nullable = false)
    private Routes routes;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "transport_id", nullable = false)
    private Transports transports;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "plans")
    private Set<PlanOfStops> planOfStopses;

    public Plans() {
    }

    public Plans(int planId, Routes routes, Transports transports) {
        this.planId = planId;
        this.routes = routes;
        this.transports = transports;
    }

    public Plans(int planId, Routes routes, Transports transports, Set<PlanOfStops> planOfStopses) {
        this.planId = planId;
        this.routes = routes;
        this.transports = transports;
        this.planOfStopses = planOfStopses;
    }

}
