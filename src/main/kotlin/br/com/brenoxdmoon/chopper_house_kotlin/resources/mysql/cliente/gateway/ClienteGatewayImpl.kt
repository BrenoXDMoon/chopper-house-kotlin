package br.com.brenoxdmoon.chopper_house_kotlin.resources.mysql.cliente.gateway

import br.com.brenoxdmoon.chopper_house_kotlin.domain.cliente.entities.Cliente
import br.com.brenoxdmoon.chopper_house_kotlin.domain.gateways.ClienteGateway
import br.com.brenoxdmoon.chopper_house_kotlin.resources.mysql.cliente.entities.ClienteModel
import br.com.brenoxdmoon.chopper_house_kotlin.resources.mysql.cliente.repositories.ClienteRepository
import org.springframework.stereotype.Component

@Component
class ClienteGatewayImpl(
    private val clienteRepository: ClienteRepository
) : ClienteGateway {

    override fun salvar(cliente: ClienteModel): ClienteModel {

        return clienteRepository.save(cliente)
    }

    override fun buscarPorEmail(email: String): ClienteModel? {
        return clienteRepository.findByEmail(email).orElse(null)
    }
}