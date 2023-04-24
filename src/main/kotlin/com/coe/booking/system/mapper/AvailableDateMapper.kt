package com.coe.booking.system.mapper

import com.coe.booking.system.dto.AvailableDateDto
import com.coe.booking.system.dto.CreateAvailableDateDto
import com.coe.booking.system.dto.NurseryDto
import com.coe.booking.system.dto.UserDto
import com.coe.booking.system.entity.AvailableDate
import com.coe.booking.system.entity.Nursery
import com.coe.booking.system.entity.User
import com.coe.booking.system.model.response.AvailableDateViewModel
import com.coe.booking.system.model.response.NurseryViewModel
import com.coe.booking.system.model.response.UserViewModel
import org.mapstruct.Mapper
import org.mapstruct.ReportingPolicy

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
interface AvailableDateMapper {
    fun availableDateEntityToAvailableDateDto(availableDate: AvailableDate): AvailableDateDto
    fun availableDateDtoToAvailableDateEntity(availableDateDto: AvailableDateDto): AvailableDate
    fun availableDateDtoToAvailableDateViewModel(availableDateDto: AvailableDateDto): AvailableDateViewModel
    fun createAvailableDateDtoToAvailableDateEntity(createAvailableDateDto: CreateAvailableDateDto): AvailableDate
    fun createAvailableDateDtoToAvailableDateViewModel(createAvailableDateDto: CreateAvailableDateDto): AvailableDateViewModel
}