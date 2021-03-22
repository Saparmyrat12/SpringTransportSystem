package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;
import javax.persistence.*;

import static javax.persistence.GenerationType.AUTO;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "transports")
public class Transports implements java.io.Serializable {
    @Id
    @GeneratedValue(strategy = AUTO)
    @Column(name = "transport_id", unique = true, nullable = false)
    private Long transportId;

    @Column(name = "model", nullable = false, length = 50)
    private String model;

    @Column(name = "number", unique = true, nullable = false, length = 50)
    private String number;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "transports")
    private Set<Plans> planses;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "type", nullable = false)
    private TransportType transportType;


}
