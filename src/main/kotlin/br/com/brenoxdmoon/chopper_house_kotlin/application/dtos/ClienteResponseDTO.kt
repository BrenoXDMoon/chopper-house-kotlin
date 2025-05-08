package br.com.brenoxdmoon.chopper_house_kotlin.application.dtos

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
    val enderecos: List<EnderecoResponseDTO>,
    val cartoes: List<CartaoCreditoResponseDTO>,
    val tipoCliente: String,
    val telefone: String,
    val roles: String,
)
