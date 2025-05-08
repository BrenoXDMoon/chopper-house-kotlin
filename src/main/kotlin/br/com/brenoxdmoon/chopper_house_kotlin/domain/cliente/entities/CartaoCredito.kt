package br.com.brenoxdmoon.chopper_house_kotlin.domain.cliente.entities

import java.time.LocalDateTime

data class CartaoCredito(
    val id: Long,
    val dataAtualizacao: LocalDateTime,
    val ativo: Boolean,
    val numeroCartao: String,
    val bandeira: String,
    val nomeImpresso: String,
    val validade: String,
    val codigoSeguranca: String,
)
