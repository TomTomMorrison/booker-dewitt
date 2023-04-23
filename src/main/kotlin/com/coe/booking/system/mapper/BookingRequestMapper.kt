package com.coe.booking.system.mapper

import com.coe.booking.system.dto.BookingRequestDto
import com.coe.booking.system.dto.CreateBookingRequestDto
import com.coe.booking.system.entity.BookingRequest
import com.coe.booking.system.model.request.BookingRequestViewModel
import com.coe.booking.system.model.response.BookingRequestResponseViewModel
import org.mapstruct.Mapper
import org.mapstruct.ReportingPolicy

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
interface BookingRequestMapper {
    fun bookingRequestEntityToBookingRequestDto(bookingRequest: BookingRequest): BookingRequestDto
    fun bookingRequestDtoToBookingRequestEntity(bookingRequestDto: BookingRequestDto): BookingRequest

    fun bookingRequestDtoToBookingRequestViewModel(bookingRequestDto: BookingRequestDto): BookingRequestViewModel
    fun bookingRequestDtoToBookingRequestResponseViewModel(bookingRequestDto: BookingRequestDto): BookingRequestResponseViewModel
    fun createBookingRequestDtoToBookingRequestEntity(createBookingRequestDto: CreateBookingRequestDto): BookingRequest
    fun createBookingRequestDtoToBookingRequestViewModel(createBookingRequestDto: CreateBookingRequestDto): BookingRequestViewModel
    fun createBookingRequestDtoToBookingRequestResponseViewModel(createBookingRequestDto: CreateBookingRequestDto): BookingRequestResponseViewModel
}