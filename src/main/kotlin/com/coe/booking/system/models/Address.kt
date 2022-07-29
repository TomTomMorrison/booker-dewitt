package com.coe.booking.system.models

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "address")
class Address(

    @Id
    @Column(name = "id")
    var id: Int,

    @Column(name = "address")
    var address: String,

    @Column(name = "city")
    var city: String,

    @Column(name = "postcode")
    var postcode: String
)