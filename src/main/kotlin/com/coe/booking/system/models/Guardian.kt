package com.coe.booking.system.models

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "guardian")
class Guardian(

    @Id
    @Column(name = "id")
    var id: Int,

    @Column(name = "name")
    var name: String,

    @Column(name = "email")
    var email: String,

    @Column(name = "password")
    var password: String,

    @Column(name = "contact_number")
    var contactNumber: String,

    @Column(name = "address_id")
    var addressId: Int
)
