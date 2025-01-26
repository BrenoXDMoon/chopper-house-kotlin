package br.com.brenoxdmoon.chopper_house_kotlin.resources.mysql.cliente.entities

import br.com.brenoxdmoon.chopper_house_kotlin.resources.mysql.cliente.entities.listeners.AuditDomainEntityListener
import jakarta.persistence.*
import org.springframework.format.annotation.DateTimeFormat
import java.time.LocalDateTime

@MappedSuperclass
@EntityListeners(value = [AuditDomainEntityListener::class])
open class DomainEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long? = null,

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Temporal(TemporalType.DATE) var dataCriacao: LocalDateTime = LocalDateTime.now()
)