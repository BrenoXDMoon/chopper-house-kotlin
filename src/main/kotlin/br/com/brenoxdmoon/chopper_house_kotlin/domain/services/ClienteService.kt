package br.com.brenoxdmoon.chopper_house_kotlin.domain.services

import br.com.brenoxdmoon.chopper_house_kotlin.application.web.dtos.ClienteRequestDTO
import br.com.brenoxdmoon.chopper_house_kotlin.domain.cliente.entities.Cliente
import br.com.brenoxdmoon.chopper_house_kotlin.domain.gateways.ClienteGateway
import org.springframework.stereotype.Service

@Service
class ClienteService(val clienteGateway: ClienteGateway) {
    fun salvarCliente(cliente: ClienteRequestDTO): Cliente {
        return clienteGateway.salvarCliente()
    }

}
