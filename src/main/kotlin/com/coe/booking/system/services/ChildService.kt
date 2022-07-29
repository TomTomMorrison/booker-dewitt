package com.coe.booking.system.services

import com.coe.booking.system.models.Child
import com.coe.booking.system.models.Nursery
import com.coe.booking.system.repositories.ChildRepository
import com.coe.booking.system.repositories.NurseryRepository
import org.springframework.stereotype.Service

@Service
class ChildService(
    childRepository: ChildRepository
) {

    val childRepository = childRepository

    fun getChild(childId: Int): Child {
        return childRepository.getReferenceById(childId)
    }

    fun addChild(child: Child) {
        childRepository.save(child)
    }

    fun deleteChild(childId: Int) {
        childRepository.deleteById(childId)
    }
}