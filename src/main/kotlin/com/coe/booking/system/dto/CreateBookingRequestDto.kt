package com.coe.booking.system.dto

import com.fasterxml.jackson.annotation.JsonProperty

class CreateBookingRequestDto(
    @JsonProperty(value = "childId")
    childId: Int,
    @JsonProperty(value = "availableDateId")
    availableDateId: Int
) {
}