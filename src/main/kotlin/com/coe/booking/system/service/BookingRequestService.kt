package com.coe.booking.system.service

import com.coe.booking.system.dto.*
import com.coe.booking.system.mapper.BookingRequestMapper
import com.coe.booking.system.repository.BookingRequestRepository
import org.springframework.stereotype.Service
import java.sql.Timestamp

@Service
class BookingRequestService(
    private val bookingRequestRepository: BookingRequestRepository,
    private val bookingRequestMapper: BookingRequestMapper,
) {

    fun getBookingRequestsByNurseryId(nurseryId: Int) : List<BookingRequestDto> {
        return bookingRequestRepository.findBookingRequestsByNurseryId(nurseryId).map { br -> bookingRequestMapper.bookingRequestEntityToBookingRequestDto(br) }
    }

    fun getBookingRequestsByNurseryIdAndStatusId(nurseryId: Int, statusId: Int) : List<BookingRequestDto> {
        return bookingRequestRepository.findBookingRequestsByNurseryIdAndStatusId(nurseryId, statusId).map { br -> bookingRequestMapper.bookingRequestEntityToBookingRequestDto(br) }
    }

    fun createBookingRequest(createBookingRequest: CreateBookingRequestDto) : BookingRequestDto {
        val bookingRequest = bookingRequestMapper.createBookingRequestDtoToBookingRequestEntity(createBookingRequest)
        bookingRequest.requestDateTime = Timestamp(System.currentTimeMillis())
        bookingRequestRepository.save(bookingRequest)
        return bookingRequestMapper.bookingRequestEntityToBookingRequestDto(bookingRequest)
    }

    fun updateBookingRequest(bookingRequestId: Int, createBookingRequestDto: CreateBookingRequestDto): BookingRequestDto {
        val bookingRequest = bookingRequestRepository.findById(bookingRequestId)
        val update = bookingRequestMapper.createBookingRequestDtoToBookingRequestEntity(createBookingRequestDto)
        if(bookingRequest.isPresent) {
            bookingRequest.get().apply {
                this.child = update.child
                this.status = update.status
                bookingRequestRepository.save(this)
                return bookingRequestMapper.bookingRequestEntityToBookingRequestDto(this)
            }
        }
        return bookingRequestMapper.bookingRequestEntityToBookingRequestDto(update)
    }

}