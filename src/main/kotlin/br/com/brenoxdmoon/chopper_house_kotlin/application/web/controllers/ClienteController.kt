package br.com.brenoxdmoon.chopper_house_kotlin.application.web.controllers

import br.com.brenoxdmoon.chopper_house_kotlin.application.dtos.ClienteDTO
import br.com.brenoxdmoon.chopper_house_kotlin.application.dtos.ClienteResponseDTO
import br.com.brenoxdmoon.chopper_house_kotlin.application.facades.ClienteFacade
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.http.HttpStatus

@RestController
@RequestMapping("/clientes")
class ClienteController(
    private val clienteFacade: ClienteFacade
) {

    @PostMapping
    fun criarCliente(@RequestBody clienteDTO: ClienteDTO): ResponseEntity<ClienteResponseDTO> =
        ResponseEntity.status(HttpStatus.CREATED).body(clienteFacade.criarCliente(clienteDTO))
}
