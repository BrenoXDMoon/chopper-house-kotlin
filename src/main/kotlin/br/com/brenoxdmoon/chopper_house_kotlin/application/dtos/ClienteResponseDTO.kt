package br.com.brenoxdmoon.chopper_house_kotlin.application.dtos

import br.com.brenoxdmoon.chopper_house_kotlin.resources.mysql.cliente.entities.CartaoCreditoModel
import br.com.brenoxdmoon.chopper_house_kotlin.resources.mysql.cliente.entities.EnderecoModel
import java.time.LocalDateTime

data class ClienteResponseDTO(
    val id: Long?,
    val dataAtualizacao: LocalDateTime,
    val ativo: Boolean,
    val nomeCompleto: String,
    val email: String,
    val dataNascimento: String,
    val senha: String,
    val cpf: String,
    val enderecos: List<EnderecoModel>,
    val cartoes: List<CartaoCreditoModel>,
    val tipoCliente: String,
    val telefone: String,
    val roles: String,
)
