package com.coe.booking.system.dto

import com.coe.booking.system.entity.Nursery
import com.coe.booking.system.entity.Status
import java.sql.Timestamp

data class AvailableDateDto (
    var id: Int,
    var availableDateTime: Timestamp,
    var nursery: Nursery,
    var status: Status
){}