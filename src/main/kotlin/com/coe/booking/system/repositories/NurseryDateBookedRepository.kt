package com.coe.booking.system.repositories

import com.coe.booking.system.models.NurseryDateBooked
import org.springframework.data.jpa.repository.JpaRepository

interface NurseryDateBookedRepository : JpaRepository<NurseryDateBooked, Int>