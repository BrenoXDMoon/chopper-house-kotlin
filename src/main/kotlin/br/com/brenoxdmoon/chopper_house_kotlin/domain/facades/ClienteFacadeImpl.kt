package br.com.brenoxdmoon.chopper_house_kotlin.domain.facades

import br.com.brenoxdmoon.chopper_house_kotlin.application.dtos.ClienteDTO
import br.com.brenoxdmoon.chopper_house_kotlin.application.dtos.ClienteResponseDTO
import br.com.brenoxdmoon.chopper_house_kotlin.application.facades.ClienteFacade
import br.com.brenoxdmoon.chopper_house_kotlin.domain.services.ClienteService
import org.springframework.stereotype.Component

@Component
class ClienteFacadeImpl(private val clienteService: ClienteService) : ClienteFacade {
    override fun criarCliente(clienteDto: ClienteDTO): ClienteResponseDTO = clienteService.criarCliente(clienteDto).toDTO()
}