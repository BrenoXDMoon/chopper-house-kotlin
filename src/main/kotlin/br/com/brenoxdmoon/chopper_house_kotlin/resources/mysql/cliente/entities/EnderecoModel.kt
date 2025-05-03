package br.com.brenoxdmoon.chopper_house_kotlin.resources.mysql.cliente.entities

import jakarta.persistence.*
import jakarta.validation.constraints.NotBlank
import jakarta.validation.constraints.NotNull

//TODO: colocar as anotações de validação em uma classe DTO
@Entity
@Table(name = "endereco")
class EnderecoModel(
    @NotBlank(message = "Logradouro não pode estar em branco")
    @NotNull
    val logradouro: String,

    @NotBlank(message = "Número do endereço não pode estar em branco")
    @NotNull
    val numero: String,

    @NotBlank(message = "CEP não pode estar em branco")
    @NotNull
    val cep: String,

    val complemento: String? = null,

    @NotBlank(message = "Cidade não pode estar em branco")
    @NotNull
    val cidade: String,

    @NotBlank(message = "Estado não pode estar em branco")
    @NotNull
    val estado: String,

    val tipoEndereco: String,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id")
    val cliente: ClienteModel
) : PersistDomainEntity()