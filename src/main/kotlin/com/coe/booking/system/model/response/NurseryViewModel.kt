package com.coe.booking.system.model.response

import com.fasterxml.jackson.annotation.JsonProperty

class NurseryViewModel(
    @JsonProperty(value = "id")
    var id: Int,
    @JsonProperty(value = "name")
    var name: String,
    @JsonProperty(value = "email")
    var email: String,
    @JsonProperty(value = "contactNumber")
    var contactNumber: String,
    @JsonProperty(value = "addressId")
    var addressId: Int
) {
}