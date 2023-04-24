package com.coe.booking.system.service

import com.coe.booking.system.dto.*
import com.coe.booking.system.mapper.AvailableDateMapper
import com.coe.booking.system.repository.AvailableDateRepository
import org.springframework.stereotype.Service

@Service
class AvailableDateService(
    private val availableDateRepository: AvailableDateRepository,
    private val availableDateMapper: AvailableDateMapper,
) {

    fun getAvailableDates(): List<AvailableDateDto> {
        return availableDateRepository.findAll().map { ad -> availableDateMapper.availableDateEntityToAvailableDateDto(ad) }
    }

    fun getAvailableDatesByNurseryId(nurseryId: Int): List<AvailableDateDto> {
        return availableDateRepository.findAvailableDatesByNurseryId(nurseryId).map { ad -> availableDateMapper.availableDateEntityToAvailableDateDto(ad) }
    }

    fun getAvailableDateById(availableDateId: Int) : AvailableDateDto {
        return availableDateMapper.availableDateEntityToAvailableDateDto(availableDateRepository.getReferenceById(availableDateId))
    }

    fun createAvailableDate(createAvailableDateDto: CreateAvailableDateDto) : AvailableDateDto {
        val availableDate = availableDateMapper.createAvailableDateDtoToAvailableDateEntity(createAvailableDateDto)
        availableDateRepository.save(availableDate)
        return availableDateMapper.availableDateEntityToAvailableDateDto(availableDate)
    }

    fun updateAvailableDate(availableDateId: Int, createAvailableDateDto: CreateAvailableDateDto): AvailableDateDto {
        val availableDate = availableDateRepository.findById(availableDateId)
        val update = availableDateMapper.createAvailableDateDtoToAvailableDateEntity(createAvailableDateDto)
        if(availableDate.isPresent) {
            availableDate.get().apply {
                this.availableDateTime = update.availableDateTime
                this.status = update.status
                availableDateRepository.save(this)
                return availableDateMapper.availableDateEntityToAvailableDateDto(this)
            }
        }
        return availableDateMapper.availableDateEntityToAvailableDateDto(update)
    }

}