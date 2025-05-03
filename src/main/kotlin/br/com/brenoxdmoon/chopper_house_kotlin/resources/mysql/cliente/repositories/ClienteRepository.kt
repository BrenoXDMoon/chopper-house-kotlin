package br.com.brenoxdmoon.chopper_house_kotlin.resources.mysql.cliente.repositories

import br.com.brenoxdmoon.chopper_house_kotlin.domain.cliente.entities.Cliente
import br.com.brenoxdmoon.chopper_house_kotlin.resources.mysql.cliente.entities.ClienteModel
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.util.Optional

@Repository
interface ClienteRepository : CrudRepository<ClienteModel, Long> {
    fun findByEmail(email: String): Optional<ClienteModel>
}