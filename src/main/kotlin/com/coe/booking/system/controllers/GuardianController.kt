package com.coe.booking.system.controllers

import com.coe.booking.system.models.Guardian
import com.coe.booking.system.services.GuardianService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/guardian")
class GuardianController(
    val guardianService: GuardianService
) {

    @GetMapping("/{guardianId}")
    fun getGuardian(@PathVariable("guardianId") guardianId: Int) = guardianService.getGuardian(guardianId)

    @PostMapping
    fun addGuardian(@RequestBody guardian: Guardian) = guardianService.addGuardian(guardian)

    @PutMapping
    fun updateGuardian(@RequestBody guardian: Guardian) = guardianService.addGuardian(guardian)

    @DeleteMapping("/{guardianId}")
    fun deleteGuardian(@PathVariable("guardianId") guardianId: Int) = guardianService.deleteGuardian(guardianId)
}