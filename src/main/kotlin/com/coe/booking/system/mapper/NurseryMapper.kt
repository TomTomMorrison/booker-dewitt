package com.coe.booking.system.mapper

import com.coe.booking.system.dto.NurseryDto
import com.coe.booking.system.entity.Nursery
import com.coe.booking.system.model.response.NurseryViewModel
import org.mapstruct.Mapper
import org.mapstruct.ReportingPolicy

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
interface NurseryMapper {
    fun nurseryEntityToNurseryDto(nursery: Nursery): NurseryDto
    fun nurseryDtoToNurseryEntity(nurseryDto: NurseryDto): Nursery
    fun nurseryDtoToNurseryViewModel(nurseryDto: NurseryDto): NurseryViewModel
}