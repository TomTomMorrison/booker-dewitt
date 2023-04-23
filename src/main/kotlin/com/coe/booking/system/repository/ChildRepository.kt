package com.coe.booking.system.repository

import com.coe.booking.system.entity.Child
import org.springframework.data.jpa.repository.JpaRepository

interface ChildRepository : JpaRepository<Child, Int>