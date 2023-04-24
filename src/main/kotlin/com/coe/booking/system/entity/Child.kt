package com.coe.booking.system.entity

import java.util.Date
import javax.persistence.*

@Entity
@Table(name = "child")
open class Child (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    open var id: Int? = null,

    @Column(name = "name", nullable = false)
    open var name: String? = null,

    @Column(name = "dob", nullable = false)
    open var dob: Date? = null,
)