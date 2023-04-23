package com.coe.booking.system.repository

import com.coe.booking.system.entity.AvailableDate
import org.springframework.data.jpa.repository.JpaRepository

interface AvailableDateRepository : JpaRepository<AvailableDate, Int> {
    fun findAvailableDatesByNurseryId(nurseryId: Int): List<AvailableDate>
}