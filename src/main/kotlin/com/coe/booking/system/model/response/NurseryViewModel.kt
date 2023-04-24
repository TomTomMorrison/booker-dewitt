package com.coe.booking.system.model.response

import com.coe.booking.system.entity.User
import com.fasterxml.jackson.annotation.JsonProperty

class NurseryViewModel(
    @JsonProperty(value = "id")
    var id: Int,
    @JsonProperty(value = "user")
    var user: User
) {
}