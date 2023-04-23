package com.coe.booking.system.dto

import com.coe.booking.system.entity.AvailableDate
import com.coe.booking.system.entity.Child
import com.coe.booking.system.entity.Status
import java.sql.Timestamp

data class BookingRequestDto (
    var id: Int,
    var requestDateTime: Timestamp,
    var child: Child,
    var availableDate: AvailableDate,
    var status: Status){}

data class BookingRequestDetailsDto(
    var id: Int,
    var childId: Int,
    var requestDateTime: Timestamp,
    var statusId: Int
){}