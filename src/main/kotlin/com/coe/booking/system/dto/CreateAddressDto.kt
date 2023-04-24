package com.coe.booking.system.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateAddressDto(
    @JsonProperty(value = "address")
    var address: String,
    @JsonProperty(value = "city")
    var city: String,
    @JsonProperty(value = "postcode")
    var postcode: String,
) {
}