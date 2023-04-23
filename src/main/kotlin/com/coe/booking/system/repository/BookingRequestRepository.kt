package com.coe.booking.system.repository

import com.coe.booking.system.entity.AvailableDate
import com.coe.booking.system.entity.BookingRequest
import org.springframework.data.jpa.repository.JpaRepository

interface BookingRequestRepository : JpaRepository<BookingRequest, Int> {
//    fun findBookingRequestsByNurseryId(nurseryId: Int): List<BookingRequest>
//    fun findBookingRequestsByNurseryIdAndStatusId(nurseryId: Int, statusId: Int): List<BookingRequest>
}