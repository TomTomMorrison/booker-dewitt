package com.coe.booking.system.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateBookingRequestDto(
    @JsonProperty(value = "childId")
    var childId: Int,
    @JsonProperty(value = "availableDateId")
    var availableDateId: Int
) {
}