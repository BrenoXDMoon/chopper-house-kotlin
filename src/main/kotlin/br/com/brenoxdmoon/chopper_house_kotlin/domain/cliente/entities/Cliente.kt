package br.com.brenoxdmoon.chopper_house_kotlin.domain.cliente.entities

import br.com.brenoxdmoon.chopper_house_kotlin.application.dtos.ClienteResponseDTO
import br.com.brenoxdmoon.chopper_house_kotlin.application.dtos.toResponseDTO
import java.time.LocalDateTime

data class Cliente(
    val id: Long,
    val dataAtualizacao: LocalDateTime,
    val ativo: Boolean,
    val nomeCompleto: String,
    val email: String,
    val dataNascimento: String,
    val senha: String,
    val cpf: String,
    val enderecos: List<Endereco>,
    val cartoes: List<CartaoCredito>,
    val tipoCliente: String,
    val telefone: String,
    val roles: String,

    //TODO: incluir fluxo de carrinho
    //private val carrinho: Carrinho,
    //@OneToMany(mappedBy = "cliente", targetEntity = Pedido::class)
    //private val pedidos: List<Pedido>
){
    fun toDTO(): ClienteResponseDTO = ClienteResponseDTO(
        id = this.id,
        nomeCompleto = this.nomeCompleto,
        email = this.email,
        cpf = this.cpf,
        telefone = this.telefone,
        dataNascimento = this.dataNascimento,
        senha = this.senha,
        enderecos = this.enderecos.map { it.toResponseDTO() },
        cartoes = this.cartoes.map { it.toResponseDTO() },
        dataAtualizacao = this.dataAtualizacao,
        ativo = this.ativo ?: false,
        tipoCliente = this.tipoCliente,
        roles = this.roles,
    )
}