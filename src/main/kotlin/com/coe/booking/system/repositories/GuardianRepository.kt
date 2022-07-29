package com.coe.booking.system.repositories

import com.coe.booking.system.models.Guardian
import org.springframework.data.jpa.repository.JpaRepository

interface GuardianRepository : JpaRepository<Guardian, Int>