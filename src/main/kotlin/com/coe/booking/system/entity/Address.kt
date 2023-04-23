package com.coe.booking.system.entity

import javax.persistence.*

@Entity
@Table(name = "address")
class Address (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    var id: Int,

    @Column(name = "address", nullable = false)
    var address: String,

    @Column(name = "city", nullable = false)
    var city: String,

    @Column(name = "postcode", nullable = false)
    var postcode: String,
)