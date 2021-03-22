package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.GenerationType.AUTO;

@Getter
@Setter
@Entity
@Table(name = "plan_of_stops")
public class PlanOfStops implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = AUTO)
    @Column(name = "plan_of_stops_id", unique = true, nullable = false)
    private int planOfStopsId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "plan_id", nullable = false)
    private Plans plans;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stop_id", nullable = false)
    private Stops stops;

    @Column(name = "arriveTime", nullable = false, length = 50)
    private String arriveTime;

    @Column(name = "leaveTime", nullable = false, length = 50)
    private String leaveTime;

    public PlanOfStops() {
    }

    public PlanOfStops(int planOfStopsId, Plans plans, Stops stops, String arriveTime, String leaveTime) {
        this.planOfStopsId = planOfStopsId;
        this.plans = plans;
        this.stops = stops;
        this.arriveTime = arriveTime;
        this.leaveTime = leaveTime;
    }
}
