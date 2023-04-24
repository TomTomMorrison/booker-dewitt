package com.coe.booking.system.entity

import javax.persistence.*

@Entity
@Table(name = "status")
open class Status(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    open var id: Int? = null,

    @Column(name = "status", nullable = false)
    open var status: String? = null,
)