package br.com.brenoxdmoon.chopper_house_kotlin.application.dtos

import br.com.brenoxdmoon.chopper_house_kotlin.domain.cliente.entities.CartaoCredito
import java.time.LocalDateTime
import kotlin.Long

data class CartaoCreditoResponseDTO(
    val id: Long,
    val dataAtualizacao: LocalDateTime,
    val ativo: Boolean,
    val numeroCartao: String,
    val bandeira: String,
    val nomeImpresso: String,
    val validade: String,
    val codigoSeguranca: String,
)

fun CartaoCredito.toResponseDTO(): CartaoCreditoResponseDTO = CartaoCreditoResponseDTO(
    id = this.id,
    dataAtualizacao = this.dataAtualizacao,
    ativo = this.ativo,
    numeroCartao = this.numeroCartao,
    bandeira = this.bandeira,
    nomeImpresso = this.nomeImpresso,
    validade = this.validade,
    codigoSeguranca = this.codigoSeguranca,
)