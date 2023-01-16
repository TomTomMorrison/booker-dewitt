package com.coe.booking.system.controllers

import com.coe.booking.system.models.Address
import com.coe.booking.system.services.AddressService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/address")
class AddressController(
    val addressService: AddressService
) {

    @GetMapping("/{addressId}")
    fun getChild(@PathVariable("addressId") addressId: Int) = addressService.getAddress(addressId)

    @GetMapping
    fun getChild() = addressService.getAddresses()

    @PostMapping
    fun addChild(@RequestBody address: Address) = addressService.addAddress(address)

    @PutMapping
    fun updateChild(@RequestBody address: Address) = addressService.addAddress(address)
}