package com.coe.booking.system.model.request

import java.sql.Timestamp

class AvailableDateRequestViewModel(
    var nurseryId: Int,
    var availableDateTime: Timestamp
) {
}