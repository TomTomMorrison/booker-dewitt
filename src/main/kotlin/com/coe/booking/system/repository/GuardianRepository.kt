package com.coe.booking.system.repository

import com.coe.booking.system.entity.Guardian
import org.springframework.data.jpa.repository.JpaRepository

interface GuardianRepository : JpaRepository<Guardian, Int>