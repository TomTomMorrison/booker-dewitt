package com.coe.booking.system.dto

import com.coe.booking.system.entity.Child
import com.coe.booking.system.entity.Guardian

data class GuardianChildDto (
    var guardian: Guardian,
    var child: Child){}