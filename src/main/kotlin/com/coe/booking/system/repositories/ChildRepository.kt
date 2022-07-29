package com.coe.booking.system.repositories

import com.coe.booking.system.models.Child
import org.springframework.data.jpa.repository.JpaRepository

interface ChildRepository : JpaRepository<Child, Int>