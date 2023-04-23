package com.coe.booking.system.service

import com.coe.booking.system.dto.*
import com.coe.booking.system.entity.Nursery
import com.coe.booking.system.mapper.AvailableDateMapper
import com.coe.booking.system.mapper.BookingRequestMapper
import com.coe.booking.system.mapper.NurseryMapper
import com.coe.booking.system.mapper.UserMapper
import com.coe.booking.system.model.response.BookingRequestResponseViewModel
import com.coe.booking.system.repository.AvailableDateRepository
import com.coe.booking.system.repository.BookingRequestRepository
import com.coe.booking.system.repository.NurseryRepository
import org.springframework.stereotype.Service
import java.sql.Timestamp
import java.time.Instant
import java.time.ZoneOffset
import java.time.format.DateTimeFormatter

@Service
class NurseryService(
    private val nurseryRepository: NurseryRepository,
    private val nurseryMapper: NurseryMapper,
    private val bookingRequestRepository: BookingRequestRepository,
    private val bookingRequestMapper: BookingRequestMapper,
    private val availableDateRepository: AvailableDateRepository,
    private val availableDateMapper: AvailableDateMapper
) {

    fun getNursery(nurseryId: Int): NurseryDto {
        return nurseryMapper.nurseryEntityToNurseryDto(nurseryRepository.getReferenceById(nurseryId));
    }

    fun getNurseries(): List<NurseryDto> {
        return nurseryRepository.findAll().map { n -> nurseryMapper.nurseryEntityToNurseryDto(n) }
    }

    fun getAvailableDates(): List<AvailableDateDto> {
        return availableDateRepository.findAll().map { ad -> availableDateMapper.availableDateEntityToAvailableDateDto(ad) }
    }

    fun getAvailableDatesByNurseryId(nurseryId: Int): List<AvailableDateDto> {
        return availableDateRepository.findAvailableDatesByNurseryId(nurseryId).map { ad -> availableDateMapper.availableDateEntityToAvailableDateDto(ad) }
    }

    fun getAvailableDateById(availableDateId: Int) : AvailableDateDto {
        return availableDateMapper.availableDateEntityToAvailableDateDto(availableDateRepository.getReferenceById(availableDateId))
    }

    // TODO fix repo calls
    fun getBookingRequestsByNurseryId(nurseryId: Int) : List<BookingRequestDto> {
        return bookingRequestRepository.findAll().map { br -> bookingRequestMapper.bookingRequestEntityToBookingRequestDto(br) }
    }

    // TODO fix repo calls
    fun getBookingRequestsByNurseryIdAndStatusId(nurseryId: Int, statusId: Int) : List<BookingRequestDto> {
        return bookingRequestRepository.findAll().map { br -> bookingRequestMapper.bookingRequestEntityToBookingRequestDto(br) }
    }

    fun createBookingRequest(createBookingRequest: CreateBookingRequestDto) : BookingRequestDto {
        val bookingRequest = bookingRequestMapper.createBookingRequestDtoToBookingRequestEntity(createBookingRequest)
        bookingRequest.requestDateTime = Timestamp(System.currentTimeMillis())
        bookingRequestRepository.save(bookingRequest)
        return bookingRequestMapper.bookingRequestEntityToBookingRequestDto(bookingRequest)
    }

}