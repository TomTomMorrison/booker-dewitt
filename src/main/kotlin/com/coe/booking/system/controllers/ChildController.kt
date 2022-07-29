package com.coe.booking.system.controllers

import com.coe.booking.system.models.Child
import com.coe.booking.system.models.Nursery
import com.coe.booking.system.services.ChildService
import com.coe.booking.system.services.NurseryService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PutMapping

@RestController
@RequestMapping("/child")
class ChildController(
    val childService: ChildService
) {

    @GetMapping("/{childId}")
    fun getChild(@PathVariable("childId") childId: Int) = childService.getChild(childId)

    @PostMapping
    fun addChild(child: Child) = childService.addChild(child)

    @PutMapping
    fun updateChild(child: Child) = childService.addChild(child)

    @DeleteMapping("/{childId}")
    fun deleteChild(@PathVariable("childId") childId: Int) = childService.deleteChild(childId)
}