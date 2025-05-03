package br.com.brenoxdmoon.chopper_house_kotlin.resources.mysql.cliente.entities

import br.com.brenoxdmoon.chopper_house_kotlin.resources.mysql.cliente.entities.listeners.AuditingListener
import jakarta.persistence.EntityListeners
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.MappedSuperclass
import java.time.LocalDateTime

@MappedSuperclass
@EntityListeners(AuditingListener::class)
abstract class PersistDomainEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    var dataAtualizacao: LocalDateTime? = null,
    var ativo: Boolean? = false,
)