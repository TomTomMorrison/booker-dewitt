package com.coe.booking.system.services

import com.coe.booking.system.models.Address
import com.coe.booking.system.models.Child
import com.coe.booking.system.models.Nursery
import com.coe.booking.system.repositories.AddressRepository
import com.coe.booking.system.repositories.ChildRepository
import com.coe.booking.system.repositories.NurseryRepository
import org.springframework.stereotype.Service

@Service
class AddressService(
    addressRepository: AddressRepository
) {

    val addressRepository = addressRepository

    fun getAddress(addressId: Int): Address {
        return addressRepository.getReferenceById(addressId)
    }

    fun getAddresses(): List<Address> {
        return addressRepository.findAll()
    }

    fun addAddress(address: Address) {
        addressRepository.save(address)
    }
}