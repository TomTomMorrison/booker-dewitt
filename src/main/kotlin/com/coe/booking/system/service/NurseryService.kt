package com.coe.booking.system.service

import com.coe.booking.system.dto.*
import com.coe.booking.system.mapper.NurseryMapper
import com.coe.booking.system.mapper.UserMapper
import com.coe.booking.system.repository.NurseryRepository
import com.coe.booking.system.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class NurseryService(
    private val nurseryRepository: NurseryRepository,
    private val nurseryMapper: NurseryMapper,
    private val userMapper: UserMapper,
    private val userRepository: UserRepository
) {

    fun getNursery(nurseryId: Int): NurseryDto {
        return nurseryMapper.nurseryEntityToNurseryDto(nurseryRepository.getReferenceById(nurseryId));
    }

    fun getNurseries(): List<UserDto> {
        println("Getting nurseries")
        return userRepository.findAll().map { n -> userMapper.userEntityToUserDto(n) }
    }

    fun createNursery(createUserDto: CreateUserDto) : UserDto {
        val user = userMapper.createUserDtoToUserEntity(createUserDto)
        userRepository.save(user)
        return userMapper.userEntityToUserDto(user)
    }

    fun updateNursery(nurseryId: Int, createUserDto: CreateUserDto): UserDto {
        val nursery = userRepository.findById(nurseryId)
        val update = userMapper.createUserDtoToUserEntity(createUserDto)
        if(nursery.isPresent) {
            nursery.get().apply {
                this.password = update.password
                this.email = update.email
                this.name = update.name
                this.contactNumber = update.contactNumber
                userRepository.save(this)
                return userMapper.userEntityToUserDto(this)
            }
        }
        return userMapper.userEntityToUserDto(update)
    }

}