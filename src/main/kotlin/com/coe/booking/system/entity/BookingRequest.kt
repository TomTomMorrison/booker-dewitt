package com.coe.booking.system.entity

import com.fasterxml.jackson.annotation.JsonIgnore
import org.hibernate.annotations.OnDelete
import org.hibernate.annotations.OnDeleteAction
import java.sql.Timestamp
import javax.persistence.*

@Entity
@Table(name = "nursery_child_date_available_request")
open class BookingRequest(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    open var id: Int? = null,

    @Column(name = "request_date_time", nullable = false)
    open var requestDateTime: Timestamp,

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "child_id")
    @JsonIgnore
    open var child: Child? = null,

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "available_dates_id")
    @JsonIgnore
    open var availableDate: AvailableDate? = null,

    @ManyToOne(fetch = FetchType.LAZY)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "status_id")
    @JsonIgnore
    open var status: Status? = null,
)