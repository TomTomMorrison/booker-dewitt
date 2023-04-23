package com.coe.booking.system.entity

import javax.persistence.*

@Entity
@Table(name = "status")
class Status(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    var id: Int,

    @Column(name = "status", nullable = false)
    var status: String,
)