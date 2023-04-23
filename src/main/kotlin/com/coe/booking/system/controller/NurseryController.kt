package com.coe.booking.system.controller

import com.coe.booking.system.dto.CreateBookingRequestDto
import com.coe.booking.system.mapper.AvailableDateMapper
import com.coe.booking.system.mapper.BookingRequestMapper
import com.coe.booking.system.mapper.NurseryMapper
import com.coe.booking.system.model.request.BookingRequestViewModel
import com.coe.booking.system.model.response.AvailableDateViewModel
import com.coe.booking.system.model.response.BookingRequestResponseViewModel
import com.coe.booking.system.model.response.NurseryViewModel
import com.coe.booking.system.service.NurseryService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/nurseries")
class NurseryController(
    val nurseryService: NurseryService,
    val nurseryMapper: NurseryMapper,
    val availableDateMapper: AvailableDateMapper,
    val bookingRequestMapper: BookingRequestMapper
) {

    @GetMapping
    fun getNurseries() : ResponseEntity<List<NurseryViewModel>> {
        val nurseries = nurseryService.getNurseries()
        return ResponseEntity(nurseries.map { n -> nurseryMapper.nurseryDtoToNurseryViewModel(n) } , HttpStatus.OK)
    }

    @GetMapping("/{id}")
    fun getNursery(@PathVariable("id") id: Int) : ResponseEntity<NurseryViewModel> {
        val nursery = nurseryMapper.nurseryDtoToNurseryViewModel(nurseryService.getNursery(id))
        return ResponseEntity(nursery, HttpStatus.OK)
    }

    @GetMapping("/available-dates")
    fun getAvailableDates() : ResponseEntity<List<AvailableDateViewModel>> {
        val availableDates = nurseryService.getAvailableDates()
        return ResponseEntity(availableDates.map { ad -> availableDateMapper.availableDateDtoToAvailableDateViewModel(ad) }, HttpStatus.OK)
    }

    @GetMapping("/{id}/available-dates")
    fun getAvailableDatesByNursery(@PathVariable("id") nurseryId: Int) : ResponseEntity<List<AvailableDateViewModel>> {
        val availableDates = nurseryService.getAvailableDatesByNurseryId(nurseryId)
        return ResponseEntity(availableDates.map { ad -> availableDateMapper.availableDateDtoToAvailableDateViewModel(ad) }, HttpStatus.OK)
    }

    @GetMapping("/available-dates/{id}")
    fun getAvailableDateById(@PathVariable("id") availableDateId: Int) : ResponseEntity<AvailableDateViewModel> {
        val availableDate = availableDateMapper.availableDateDtoToAvailableDateViewModel(nurseryService.getAvailableDateById(availableDateId))
        return ResponseEntity(availableDate, HttpStatus.OK)
    }

    @GetMapping("/{id}/booking-requests")
    fun getBookingRequestsByNursery(@PathVariable("id") nurseryId: Int, @RequestParam(required = false) statusId: Int) : ResponseEntity<List<BookingRequestResponseViewModel>> {
        val bookingRequests = nurseryService.getBookingRequestsByNurseryIdAndStatusId(nurseryId, statusId)
        return ResponseEntity(bookingRequests.map { br -> bookingRequestMapper.bookingRequestDtoToBookingRequestResponseViewModel(br) } , HttpStatus.OK)
    }

    @PostMapping("/booking-request")
    fun createBookingRequests(@RequestBody createBooking: CreateBookingRequestDto) : ResponseEntity<BookingRequestViewModel> {
        val bookingRequest = bookingRequestMapper.bookingRequestDtoToBookingRequestViewModel(nurseryService.createBookingRequest(createBooking))
        return ResponseEntity(bookingRequest , HttpStatus.CREATED)
    }

}