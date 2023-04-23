package com.coe.booking.system.model.response

import com.coe.booking.system.dto.AvailableDateDto
import com.coe.booking.system.dto.NurseryAvailableDateDto
import com.fasterxml.jackson.annotation.JsonProperty

class NurseryAvailableDateViewModel(
    @JsonProperty("nurseryId")
    var nurseryId: Int,
    @JsonProperty("availableDateTimes")
    var availableDateTimes: List<NurseryAvailableDateDto>,
) {
}