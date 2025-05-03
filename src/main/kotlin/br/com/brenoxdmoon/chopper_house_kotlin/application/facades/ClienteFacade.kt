package br.com.brenoxdmoon.chopper_house_kotlin.application.facades

import br.com.brenoxdmoon.chopper_house_kotlin.application.dtos.ClienteDTO
import br.com.brenoxdmoon.chopper_house_kotlin.application.dtos.ClienteResponseDTO

interface ClienteFacade {
    fun criarCliente(clienteDto: ClienteDTO): ClienteResponseDTO
}
