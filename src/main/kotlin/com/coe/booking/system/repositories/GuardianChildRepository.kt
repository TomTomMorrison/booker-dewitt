package com.coe.booking.system.repositories

import com.coe.booking.system.models.GuardianChild
import org.springframework.data.jpa.repository.JpaRepository

interface GuardianChildRepository : JpaRepository<GuardianChild, Int>