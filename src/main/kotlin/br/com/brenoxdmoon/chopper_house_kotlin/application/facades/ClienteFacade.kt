package br.com.brenoxdmoon.chopper_house_kotlin.application.facades

import br.com.brenoxdmoon.chopper_house_kotlin.application.web.dtos.ClienteRequestDTO
import br.com.brenoxdmoon.chopper_house_kotlin.application.web.dtos.ClienteResponseDTO

interface ClienteFacade {
    fun salvarCliente(cliente: ClienteRequestDTO) : ClienteResponseDTO

}
