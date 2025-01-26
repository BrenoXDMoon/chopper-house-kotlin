package br.com.brenoxdmoon.chopper_house_kotlin.domain.facades

import br.com.brenoxdmoon.chopper_house_kotlin.application.facades.ClienteFacade
import br.com.brenoxdmoon.chopper_house_kotlin.application.web.dtos.ClienteRequestDTO
import br.com.brenoxdmoon.chopper_house_kotlin.application.web.dtos.ClienteResponseDTO
import br.com.brenoxdmoon.chopper_house_kotlin.domain.services.ClienteService
import org.springframework.stereotype.Component

@Component
class ClienteFacadeImpl(private val clienteService: ClienteService) : ClienteFacade {
    override fun salvarCliente(cliente: ClienteRequestDTO): ClienteResponseDTO {
        val clienteSalvo = clienteService.salvarCliente(cliente)
        TODO("Not yet implemented")
    }
}