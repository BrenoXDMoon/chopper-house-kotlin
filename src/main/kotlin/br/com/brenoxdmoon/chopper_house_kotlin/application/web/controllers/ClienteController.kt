package br.com.brenoxdmoon.chopper_house_kotlin.application.web.controllers

import br.com.brenoxdmoon.chopper_house_kotlin.application.facades.ClienteFacade
import br.com.brenoxdmoon.chopper_house_kotlin.application.web.dtos.ClienteRequestDTO
import br.com.brenoxdmoon.chopper_house_kotlin.application.web.dtos.ClienteResponseDTO
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/cliente")
class ClienteController(private val clienteFacade: ClienteFacade) {

    @PostMapping
    fun salvarCliente(cliente: ClienteRequestDTO): ResponseEntity<ClienteResponseDTO> {
        clienteFacade.salvarCliente(cliente)
        TODO()
    }
}