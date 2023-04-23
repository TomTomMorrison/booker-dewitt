package com.coe.booking.system.model.response

import com.coe.booking.system.dto.BookingRequestDetailsDto
import com.fasterxml.jackson.annotation.JsonProperty
import java.sql.Timestamp

class BookingRequestResponseViewModel(
    @JsonProperty("availableDatesId")
    var availableDatesId: Int,
    @JsonProperty("availableDateTime")
    var availableDatetime: Timestamp,
    @JsonProperty("bookingRequest")
    var bookingRequest: BookingRequestDetailsDto
) {
}