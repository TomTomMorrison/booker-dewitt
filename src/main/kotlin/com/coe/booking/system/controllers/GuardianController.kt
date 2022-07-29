package com.coe.booking.system.controllers

import com.coe.booking.system.services.GuardianService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import com.coe.booking.system.models.Guardian
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody

@RestController
@RequestMapping("/guardian")
class GuardianController(
    val guardianService: GuardianService
) {

    @GetMapping("/{guardianId}")
    fun getGuardian(@PathVariable("guardianId") guardianId: Int) = guardianService.getGuardian(guardianId)

    @PostMapping
    fun addGuardian(guardian: Guardian) = guardianService.addGuardian(guardian)

    @PutMapping
    fun updateGuardian(guardian: Guardian) = guardianService.addGuardian(guardian)

    @DeleteMapping("/{guardianId}")
    fun deleteGuardian(@PathVariable("guardianId") guardianId: Int) = guardianService.deleteGuardian(guardianId)
}