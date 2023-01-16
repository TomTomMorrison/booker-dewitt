package com.coe.booking.system.repositories

import com.coe.booking.system.models.NurseryDateAvailable
import org.springframework.data.jpa.repository.JpaRepository

interface NurseryDateAvailableRepository : JpaRepository<NurseryDateAvailable, Int> {

    fun findByNurseryId(nurseryId: Int): List<NurseryDateAvailable>
}