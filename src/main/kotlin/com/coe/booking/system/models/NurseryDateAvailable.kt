package com.coe.booking.system.models

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "nursery_date_available")
class NurseryDateAvailable (

        @Id
        @Column(name = "id")
        var id: Int,

        @Column(name = "date")
        var date: String,

        @Column(name = "nursery_id")
        var nurseryId: Int,
)