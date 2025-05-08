package br.com.brenoxdmoon.chopper_house_kotlin.application.dtos

import br.com.brenoxdmoon.chopper_house_kotlin.domain.cliente.entities.Cliente
import br.com.brenoxdmoon.chopper_house_kotlin.domain.cliente.entities.Endereco
import java.time.LocalDateTime
import kotlin.Long

data class EnderecoResponseDTO(
    var id: Long,
    var dataAtualizacao: LocalDateTime,
    var ativo: Boolean,
    val logradouro: String,
    val numero: String,
    val cep: String,
    val complemento: String? = null,
    val cidade: String,
    val estado: String,
    val tipoEndereco: String,
)

fun Endereco.toResponseDTO(): EnderecoResponseDTO = EnderecoResponseDTO(
    id = this.id,
    dataAtualizacao = this.dataAtualizacao,
    ativo = this.ativo,
    logradouro = this.logradouro,
    numero = this.numero,
    cep = this.cep,
    complemento = this.complemento,
    cidade = this.cidade ,
    estado = this.estado ,
    tipoEndereco = this.tipoEndereco ,
)