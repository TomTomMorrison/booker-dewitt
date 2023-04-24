package com.coe.booking.system.controller

import com.coe.booking.system.dto.CreateBookingRequestDto
import com.coe.booking.system.mapper.BookingRequestMapper
import com.coe.booking.system.model.request.BookingRequestViewModel
import com.coe.booking.system.model.response.BookingRequestResponseViewModel
import com.coe.booking.system.service.BookingRequestService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/nurseries")
class BookingRequestController(
    val bookingRequestService: BookingRequestService,
    val bookingRequestMapper: BookingRequestMapper,
) {

    @GetMapping("/{id}/booking-requests")
    fun getBookingRequestsByNursery(@PathVariable("id") nurseryId: Int, @RequestParam(required = false) statusId: Int) : ResponseEntity<List<BookingRequestResponseViewModel>> {
        val bookingRequests = bookingRequestService.getBookingRequestsByNurseryIdAndStatusId(nurseryId, statusId)
        return ResponseEntity(bookingRequests.map { br -> bookingRequestMapper.bookingRequestDtoToBookingRequestResponseViewModel(br) } , HttpStatus.OK)
    }

    @PostMapping("/booking-request")
    fun createBookingRequest(@RequestBody createBooking: CreateBookingRequestDto) : ResponseEntity<BookingRequestViewModel> {
        val bookingRequest = bookingRequestMapper.bookingRequestDtoToBookingRequestViewModel(bookingRequestService.createBookingRequest(createBooking))
        return ResponseEntity(bookingRequest , HttpStatus.CREATED)
    }

    @PatchMapping("/booking-requests/{id}")
    fun updateBookingRequest(@PathVariable bookingRequestId: Int, @RequestBody createBookingRequestDto: CreateBookingRequestDto) : ResponseEntity<BookingRequestViewModel> {
        val updateBookingRequest = bookingRequestMapper.bookingRequestDtoToBookingRequestViewModel(bookingRequestService.updateBookingRequest(bookingRequestId, createBookingRequestDto))
        return ResponseEntity(updateBookingRequest , HttpStatus.ACCEPTED)
    }

}