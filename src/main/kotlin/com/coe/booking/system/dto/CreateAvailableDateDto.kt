package com.coe.booking.system.dto

import com.coe.booking.system.entity.Nursery
import com.coe.booking.system.entity.Status
import com.fasterxml.jackson.annotation.JsonProperty
import java.sql.Timestamp

data class CreateAvailableDateDto (
    @JsonProperty(value = "nurseryId")
    var nurseryId: String,
    @JsonProperty(value = "availableDateTime")
    var availableDateTime: Timestamp,
){}