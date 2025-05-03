package br.com.brenoxdmoon.chopper_house_kotlin.resources.mysql.cliente.entities

import jakarta.persistence.Entity
import jakarta.persistence.Table
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

//TODO: colocar as anotações de validação em uma classe DTO
@Entity
@Table(name = "cartao_credito")
class CartaoCreditoModel(
    @NotBlank
    @NotNull
    val numeroCartao: String,

    val bandeira: String,

    @NotBlank
    @NotNull
    val nomeImpresso: String,

    @NotBlank
    @NotNull
    val validade: String,

    @NotBlank
    @NotNull
    val codigoSeguranca: String,

) : PersistDomainEntity()