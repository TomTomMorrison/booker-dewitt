package com.coe.booking.system.services

import com.coe.booking.system.models.Nursery
import com.coe.booking.system.repositories.NurseryRepository
import org.springframework.stereotype.Service

@Service
class NurseryService(
    nurseryRepository: NurseryRepository
) {

    val nurseryRepository = nurseryRepository

    fun getNursery(nurseryId: Int): Nursery {
        return nurseryRepository.getReferenceById(nurseryId)
    }

    fun addNursery(nursery: Nursery) {
        nurseryRepository.save(nursery)
    }

    fun deleteNursery(nurseryId: Int) {
        nurseryRepository.deleteById(nurseryId)
    }
}