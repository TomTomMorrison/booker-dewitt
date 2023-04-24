package com.coe.booking.system.entity

import javax.persistence.*

@Entity
@Table(name = "address")
open class Address (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    open var id: Int? = null,

    @Column(name = "address", nullable = false)
    open var address: String? = null,

    @Column(name = "city", nullable = false)
    open var city: String? = null,

    @Column(name = "postcode", nullable = false)
    open var postcode: String? = null,
)