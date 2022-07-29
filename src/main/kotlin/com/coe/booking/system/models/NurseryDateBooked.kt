package com.coe.booking.system.models

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "nursery_date_booked")
class NurseryDateBooked (

        @Id
        @Column(name = "id")
        var id: Int,

        @Column(name = "nursery_date_available_id")
        var nurseryDataAvailableId: Int,

        @Column(name = "nursery_child_date_request_id")
        var nurseryChildDateRequestId: Int
)