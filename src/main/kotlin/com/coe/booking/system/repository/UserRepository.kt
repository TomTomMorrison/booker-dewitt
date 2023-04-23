package com.coe.booking.system.repository

import com.coe.booking.system.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Int>