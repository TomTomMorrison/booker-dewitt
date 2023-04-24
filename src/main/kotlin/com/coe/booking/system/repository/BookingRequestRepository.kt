package com.coe.booking.system.repository

import com.coe.booking.system.entity.BookingRequest
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query

interface BookingRequestRepository : JpaRepository<BookingRequest, Int> {

    @Query(nativeQuery = true,
    value = "select * FROM nursery_child_date_available_request br "
    + "where br.app_user_nursery_id = :nurseryId ")
    fun findBookingRequestsByNurseryId(nurseryId: Int): List<BookingRequest>

    @Query(nativeQuery = true,
    value = "select * FROM nursery_child_date_available_request br "
            + "where br.app_user_nursery_id = :nurseryId AND br.status_id = :statusId")
    fun findBookingRequestsByNurseryIdAndStatusId(nurseryId: Int, statusId: Int): List<BookingRequest>


}