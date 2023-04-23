package com.coe.booking.system.entity

import java.util.Date
import javax.persistence.*

@Entity
@Table(name = "child")
class Child (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    var id: Int,

    @Column(name = "name", nullable = false)
    var name: String,

    @Column(name = "dob", nullable = false)
    var dob: Date,
)