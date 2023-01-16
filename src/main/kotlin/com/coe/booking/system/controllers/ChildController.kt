package com.coe.booking.system.controllers

import com.coe.booking.system.models.Child
import com.coe.booking.system.services.ChildService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/child")
class ChildController(
    val childService: ChildService
) {

    @GetMapping("/{childId}")
    fun getChild(@PathVariable("childId") childId: Int) = childService.getChild(childId)

    @PostMapping
    fun addChild(@RequestBody child: Child) = childService.addChild(child)

    @PutMapping
    fun updateChild(@RequestBody child: Child) = childService.addChild(child)

    @DeleteMapping("/{childId}")
    fun deleteChild(@PathVariable("childId") childId: Int) = childService.deleteChild(childId)
}