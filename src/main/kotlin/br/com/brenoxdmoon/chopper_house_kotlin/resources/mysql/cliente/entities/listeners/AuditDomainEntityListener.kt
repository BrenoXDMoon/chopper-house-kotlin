package br.com.brenoxdmoon.chopper_house_kotlin.resources.mysql.cliente.entities.listeners

import br.com.brenoxdmoon.chopper_house_kotlin.resources.mysql.cliente.entities.DomainEntity
import jakarta.persistence.PrePersist
import java.time.LocalDateTime


class AuditDomainEntityListener {
    @PrePersist
    fun prePersist(entity: DomainEntity) {
        entity.dataCriacao = LocalDateTime.now()
    }
}
