package com.coe.booking.system.controllers

import com.coe.booking.system.models.Nursery
import com.coe.booking.system.services.NurseryService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PutMapping

@RestController
@RequestMapping("/nursery")
class NurseryController(
    val nurseryService: NurseryService
) {

    @GetMapping("/{nurseryId}")
    fun getNursery(@PathVariable("nurseryId") nurseryId: Int) = nurseryService.getNursery(nurseryId)

    @PostMapping
    fun addNursery(nursery: Nursery) = nurseryService.addNursery(nursery)

    @PutMapping
    fun updateNursery(nursery: Nursery) = nurseryService.addNursery(nursery)

    @DeleteMapping("/{nurseryId}")
    fun deleteNursery(@PathVariable("nurseryId") nurseryId: Int) = nurseryService.deleteNursery(nurseryId)
}