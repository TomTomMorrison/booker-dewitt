package com.coe.booking.system.repositories

import com.coe.booking.system.models.Nursery
import org.springframework.data.jpa.repository.JpaRepository

interface NurseryRepository : JpaRepository<Nursery, Int>