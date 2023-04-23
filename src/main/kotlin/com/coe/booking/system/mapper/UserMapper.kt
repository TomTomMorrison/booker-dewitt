package com.coe.booking.system.mapper

import com.coe.booking.system.dto.NurseryDto
import com.coe.booking.system.dto.UserDto
import com.coe.booking.system.entity.Nursery
import com.coe.booking.system.entity.User
import com.coe.booking.system.model.response.NurseryViewModel
import com.coe.booking.system.model.response.UserViewModel
import org.mapstruct.Mapper
import org.mapstruct.ReportingPolicy

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
interface UserMapper {
    fun userEntityToUserDto(user: User): UserDto
    fun userDtoToUserEntity(userDto: UserDto): User
    fun userDtoToUserViewModel(userDto: UserDto): UserViewModel
}