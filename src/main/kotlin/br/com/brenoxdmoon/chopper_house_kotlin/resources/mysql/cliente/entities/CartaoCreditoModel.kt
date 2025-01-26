package br.com.brenoxdmoon.chopper_house_kotlin.resources.mysql.cliente.entities

import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

@Entity
@Table(name = "cartao_credito")
data class CartaoCreditoModel(
    @NotBlank
    @NotNull
    private val numeroCartao: String,

    @Enumerated(EnumType.STRING)
    private val bandeira: String,

    @NotBlank
    @NotNull
    private val nomeImpresso: String,

    @NotBlank
    @NotNull
    private val validade: String,

    @NotBlank
    @NotNull
    private val codigoSeguranca: String,

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private val cliente: ClienteModel
) : DomainEntity()