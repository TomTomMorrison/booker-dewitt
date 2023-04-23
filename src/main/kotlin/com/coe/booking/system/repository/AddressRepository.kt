package com.coe.booking.system.repository

import com.coe.booking.system.entity.Address
import org.springframework.data.jpa.repository.JpaRepository

interface AddressRepository : JpaRepository<Address, Int>