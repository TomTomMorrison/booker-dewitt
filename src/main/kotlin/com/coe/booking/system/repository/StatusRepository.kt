package com.coe.booking.system.repository

import com.coe.booking.system.entity.Status
import org.springframework.data.jpa.repository.JpaRepository

interface StatusRepository : JpaRepository<Status, Int>