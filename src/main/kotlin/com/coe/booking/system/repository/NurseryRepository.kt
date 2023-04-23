package com.coe.booking.system.repository

import com.coe.booking.system.entity.Nursery
import org.springframework.data.jpa.repository.JpaRepository

interface NurseryRepository : JpaRepository<Nursery, Int>