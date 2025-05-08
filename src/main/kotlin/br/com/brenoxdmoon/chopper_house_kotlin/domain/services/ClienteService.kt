package br.com.brenoxdmoon.chopper_house_kotlin.domain.services

import br.com.brenoxdmoon.chopper_house_kotlin.application.dtos.ClienteDTO
import br.com.brenoxdmoon.chopper_house_kotlin.domain.cliente.entities.Cliente
import br.com.brenoxdmoon.chopper_house_kotlin.domain.gateways.ClienteGateway
import br.com.brenoxdmoon.chopper_house_kotlin.resources.mysql.cliente.entities.toEntity
import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
class ClienteService(
    private val clienteGateway: ClienteGateway
) {

    @Transactional
    fun criarCliente(clienteDto: ClienteDTO): Cliente {
        if (clienteGateway.buscarPorEmail(clienteDto.email) != null) {
            throw IllegalArgumentException("E-mail já cadastrado")
        }
        return clienteGateway.salvar(clienteDto.toModel()).toEntity()
    }
}
