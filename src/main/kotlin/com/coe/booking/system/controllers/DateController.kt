package com.coe.booking.system.controllers

import com.coe.booking.system.models.NurseryDateAvailable
import com.coe.booking.system.services.NurseryService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/date")
class DateController(
    val nurseryService: NurseryService
) {

    @GetMapping("/{nurseryId}")
    fun getDatesAvailableNursery(@PathVariable("nurseryId") nurseryId: Int) = nurseryService.getDatesAvailable(nurseryId)

    @PostMapping
    fun addDateAvailable(@RequestBody nurseryDatesAvailable: List<NurseryDateAvailable>) = nurseryService.addDatesAvailable(nurseryDatesAvailable)

    @DeleteMapping
    fun deleteDatesAvailable(@RequestBody nurseryDatesAvailable: List<NurseryDateAvailable>) = nurseryService.deleteDatesAvailable(nurseryDatesAvailable)
}