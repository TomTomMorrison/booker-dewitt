package com.coe.booking.system.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import org.hibernate.annotations.OnDelete
import org.hibernate.annotations.OnDeleteAction
import javax.persistence.*

@Entity
@Table(name = "app_user")
open class User (

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    open var id: Int? = null,

    @Column(name = "name", nullable = false)
    open var name: String? = null,

    @Column(name = "email", nullable = false)
    open var email: String? = null,

    @Column(name = "password", nullable = false)
    open var password: String? = null,

    @Column(name = "contact_number", nullable = false)
    open var contactNumber: String? = null,

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "address_id")
    @JsonIgnore
    open var address: Address? = null,
)