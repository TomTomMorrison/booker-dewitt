package com.coe.booking.system.model.response

import com.fasterxml.jackson.annotation.JsonProperty

class AvailableDateViewModel(
    @JsonProperty(value = "id")
    var id: Int,
    @JsonProperty(value = "availableDateTime")
    var name: String,
    @JsonProperty(value = "nurseryId")
    var nurseryId: Int
) {
}