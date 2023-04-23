package com.coe.booking.system.dto

import com.coe.booking.system.entity.Address

data class UserDto (
    var id: Int,
    var name: String,
    var email: String,
    var password: String,
    var contactNumber: String,
    var address: Address){}