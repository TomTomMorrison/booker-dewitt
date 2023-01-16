package com.coe.booking.system.controllers

import com.coe.booking.system.models.Nursery
import com.coe.booking.system.services.NurseryService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/nursery")
class NurseryController(
    val nurseryService: NurseryService
) {

    @GetMapping("/{nurseryId}")
    fun getNursery(@PathVariable("nurseryId") nurseryId: Int) = nurseryService.getNursery(nurseryId)

    @PostMapping
    fun addNursery(@RequestBody nursery: Nursery) = nurseryService.addNursery(nursery)

    @PutMapping
    fun updateNursery(@RequestBody nursery: Nursery) = nurseryService.addNursery(nursery)

    @DeleteMapping("/{nurseryId}")
    fun deleteNursery(@PathVariable("nurseryId") nurseryId: Int) = nurseryService.deleteNursery(nurseryId)
}