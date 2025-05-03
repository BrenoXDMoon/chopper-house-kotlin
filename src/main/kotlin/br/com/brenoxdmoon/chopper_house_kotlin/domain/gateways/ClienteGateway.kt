package br.com.brenoxdmoon.chopper_house_kotlin.domain.gateways

import br.com.brenoxdmoon.chopper_house_kotlin.resources.mysql.cliente.entities.ClienteModel

interface ClienteGateway {
    fun salvar(cliente: ClienteModel): ClienteModel
    fun buscarPorEmail(email: String): ClienteModel?
}