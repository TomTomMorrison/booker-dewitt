package com.coe.booking.system.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateUserDto(
    @JsonProperty(value = "name")
    var name: String,
    @JsonProperty(value = "email")
    var email: String,
    @JsonProperty(value = "password")
    var password: String,
    @JsonProperty(value = "contactNumber")
    var contactNumber: String,
    @JsonProperty(value = "address")
    var address: CreateAddressDto
) {
}