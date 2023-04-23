package com.coe.booking.system.services

import com.coe.booking.system.models.Nursery
import com.coe.booking.system.models.NurseryDateAvailable
import com.coe.booking.system.repositories.NurseryDateAvailableRepository
import com.coe.booking.system.repositories.NurseryRepository
import org.springframework.stereotype.Service

@Service
class NurseryService(
    nurseryRepository: NurseryRepository,
    nurseryDateAvailableRepository: NurseryDateAvailableRepository
) {

    val nurseryRepository = nurseryRepository
    val nurseryDateAvailableRepository = nurseryDateAvailableRepository

    fun getNursery(nurseryId: Int): Nursery {
        return nurseryRepository.getReferenceById(nurseryId)
    }

    fun addNursery(nursery: Nursery) {
        nurseryRepository.save(nursery)
    }

    fun deleteNursery(nurseryId: Int) {
        nurseryRepository.deleteById(nurseryId)
    }

    fun getDatesAvailable(nurseryId: Int): List<NurseryDateAvailable> {
        return nurseryDateAvailableRepository.findByNurseryId(nurseryId)
    }

    fun addDatesAvailable(nurseryDatesAvailable: List<NurseryDateAvailable>) {
        nurseryDateAvailableRepository.saveAll(nurseryDatesAvailable)
    }

    fun deleteDatesAvailable(nurseryDatesAvailable: List<NurseryDateAvailable>) {
//        for (nurseryDateAvailable: NurseryDateAvailable) {
//            nurseryDateAvailableRepository.deleteById(nurseryDateAvailable.nurseryId)
//        }
    }
}