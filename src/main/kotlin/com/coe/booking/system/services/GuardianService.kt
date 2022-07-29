package com.coe.booking.system.services

import com.coe.booking.system.models.Guardian
import com.coe.booking.system.repositories.GuardianRepository
import org.springframework.stereotype.Service

@Service
class GuardianService(
    guardianRepository: GuardianRepository
) {

    val guardianRepository = guardianRepository

    fun getGuardian(guardianId: Int): Guardian {
        return guardianRepository.getReferenceById(guardianId)
    }

    fun addGuardian(guardian: Guardian) {
        guardianRepository.save(guardian)
    }

    fun deleteGuardian(guardianId: Int) {
        guardianRepository.deleteById(guardianId)
    }
}