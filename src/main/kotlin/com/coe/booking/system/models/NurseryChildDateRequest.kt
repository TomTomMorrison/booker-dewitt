package com.coe.booking.system.models

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "nursery_child_date_request")
class NurseryChildDateRequest (

    @Id
    @Column(name = "id")
    var id: Int,

    @Column(name = "date")
    var date: String,

    @Column(name = "child_id")
    var childId: Int,

    @Column(name = "nursery_id")
    var nurseryId: Int,
)