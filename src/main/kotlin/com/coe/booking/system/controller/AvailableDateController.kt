package com.coe.booking.system.controller

import com.coe.booking.system.dto.CreateAvailableDateDto
import com.coe.booking.system.mapper.AvailableDateMapper
import com.coe.booking.system.model.response.AvailableDateViewModel
import com.coe.booking.system.service.AvailableDateService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/nurseries")
class AvailableDateController(
    val avaialableDateService: AvailableDateService,
    val availableDateMapper: AvailableDateMapper,
) {

    @GetMapping("/available-dates")
    fun getAvailableDates() : ResponseEntity<List<AvailableDateViewModel>> {
        val availableDates = avaialableDateService.getAvailableDates()
        return ResponseEntity(availableDates.map { ad -> availableDateMapper.availableDateDtoToAvailableDateViewModel(ad) }, HttpStatus.OK)
    }

    @GetMapping("/{id}/available-dates")
    fun getAvailableDatesByNursery(@PathVariable("id") nurseryId: Int) : ResponseEntity<List<AvailableDateViewModel>> {
        val availableDates = avaialableDateService.getAvailableDatesByNurseryId(nurseryId)
        return ResponseEntity(availableDates.map { ad -> availableDateMapper.availableDateDtoToAvailableDateViewModel(ad) }, HttpStatus.OK)
    }

    @GetMapping("/available-dates/{id}")
    fun getAvailableDateById(@PathVariable("id") availableDateId: Int) : ResponseEntity<AvailableDateViewModel> {
        val availableDate = availableDateMapper.availableDateDtoToAvailableDateViewModel(avaialableDateService.getAvailableDateById(availableDateId))
        return ResponseEntity(availableDate, HttpStatus.OK)
    }

    @PostMapping("/available-dates")
    fun createAvailableDate(@RequestBody createAvailableDateDto: CreateAvailableDateDto) : ResponseEntity<AvailableDateViewModel> {
        val createAvailableDate = availableDateMapper.availableDateDtoToAvailableDateViewModel(avaialableDateService.createAvailableDate(createAvailableDateDto))
        return ResponseEntity(createAvailableDate , HttpStatus.CREATED)
    }

    @PatchMapping("/available-dates/{id}")
    fun updateAvailableDate(@PathVariable availableDateId: Int, @RequestBody createAvailableDateDto: CreateAvailableDateDto) : ResponseEntity<AvailableDateViewModel> {
        val updateAvailableDate = availableDateMapper.availableDateDtoToAvailableDateViewModel(avaialableDateService.updateAvailableDate(availableDateId, createAvailableDateDto))
        return ResponseEntity(updateAvailableDate , HttpStatus.ACCEPTED)
    }

}