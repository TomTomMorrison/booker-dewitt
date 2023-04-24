package com.coe.booking.system.controller

import com.coe.booking.system.dto.CreateUserDto
import com.coe.booking.system.mapper.NurseryMapper
import com.coe.booking.system.mapper.UserMapper
import com.coe.booking.system.model.response.NurseryViewModel
import com.coe.booking.system.model.response.UserViewModel
import com.coe.booking.system.service.NurseryService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/nurseries")
class NurseryController(
    val nurseryService: NurseryService,
    val nurseryMapper: NurseryMapper,
    val userMapper: UserMapper
) {

    @GetMapping
    fun getNurseries() : ResponseEntity<List<UserViewModel>> {
        val nurseries = nurseryService.getNurseries()
        return ResponseEntity(nurseries.map { n -> userMapper.userDtoToUserViewModel(n) } , HttpStatus.OK)
    }

    @GetMapping("/{id}")
    fun getNursery(@PathVariable("id") id: Int) : ResponseEntity<NurseryViewModel> {
        val nursery = nurseryMapper.nurseryDtoToNurseryViewModel(nurseryService.getNursery(id))
        return ResponseEntity(nursery, HttpStatus.OK)
    }

    @PostMapping
    fun createNursery(@RequestBody createUserDto: CreateUserDto): ResponseEntity<UserViewModel> {
        val createNursery = userMapper.userDtoToUserViewModel(nurseryService.createNursery(createUserDto))
        return ResponseEntity(createNursery , HttpStatus.CREATED)
    }

    @PatchMapping("/{id}")
    fun updateNurseryPassword(@PathVariable nurseryId: Int, @RequestBody createUserDto: CreateUserDto) : ResponseEntity<UserViewModel> {
        val updateNursery = userMapper.userDtoToUserViewModel(nurseryService.updateNursery(nurseryId, createUserDto))
        return ResponseEntity(updateNursery , HttpStatus.ACCEPTED)
    }

}