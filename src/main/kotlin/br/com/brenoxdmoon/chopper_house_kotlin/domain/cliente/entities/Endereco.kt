package br.com.brenoxdmoon.chopper_house_kotlin.domain.cliente.entities

import java.time.LocalDateTime

data class Endereco(
    val id: Long,
    val dataAtualizacao: LocalDateTime,
    val ativo: Boolean,
    val logradouro: String,
    val numero: String,
    val cep: String,
    val complemento: String? = null,
    val cidade: String,
    val estado: String,
    val tipoEndereco: String,
)
