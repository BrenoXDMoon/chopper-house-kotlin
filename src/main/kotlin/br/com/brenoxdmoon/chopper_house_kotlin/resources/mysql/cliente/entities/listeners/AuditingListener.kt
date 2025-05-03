package br.com.brenoxdmoon.chopper_house_kotlin.resources.mysql.cliente.entities.listeners

import br.com.brenoxdmoon.chopper_house_kotlin.resources.mysql.cliente.entities.PersistDomainEntity
import jakarta.persistence.PrePersist
import java.time.LocalDateTime


class AuditingListener {
    @PrePersist
    fun prePersist(entity: Any) {
        if (entity is PersistDomainEntity) {
            entity.dataAtualizacao = LocalDateTime.now()
        }
    }
}
