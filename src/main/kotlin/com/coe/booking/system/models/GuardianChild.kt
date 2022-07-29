package com.coe.booking.system.models

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Table

@Entity
@Table(name = "guardian_child")
class GuardianChild (

    @Column(name = "guardian_id")
    var guardianId: Int,

    @Column(name = "child_id")
    var childId: Int
)