package com.coe.booking.system.repositories

import com.coe.booking.system.models.Address
import org.springframework.data.jpa.repository.JpaRepository

interface AddressRepository : JpaRepository<Address, Int>