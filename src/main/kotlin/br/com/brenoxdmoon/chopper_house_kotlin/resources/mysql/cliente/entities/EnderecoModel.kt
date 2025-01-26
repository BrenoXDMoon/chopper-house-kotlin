package br.com.brenoxdmoon.chopper_house_kotlin.resources.mysql.cliente.entities

import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

@Entity
@Table(name = "endereco")
class EnderecoModel(
    @NotBlank(message = "Logradouro não pode estar em branco")
    @NotNull
    private val logradouro: String,

    @NotBlank(message = "Número do endereço não pode estar em branco")
    @NotNull
    private val numero: String,

    @NotBlank(message = "CEP não pode estar em branco")
    @NotNull
    private val cep: String,

    private val complemento: String? = null,

    @NotBlank(message = "Cidade não pode estar em branco")
    @NotNull
    private val cidade: String,

    @NotBlank(message = "Estado não pode estar em branco")
    @NotNull
    private val estado: String,

    @Enumerated(EnumType.STRING)
    private val tipoEndereco: String,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id")
    private val cliente: ClienteModel
)