package br.com.brenoxdmoon.chopper_house_kotlin.domain.cliente.entities

import br.com.brenoxdmoon.chopper_house_kotlin.application.dtos.ClienteResponseDTO
import br.com.brenoxdmoon.chopper_house_kotlin.resources.mysql.cliente.entities.CartaoCreditoModel
import br.com.brenoxdmoon.chopper_house_kotlin.resources.mysql.cliente.entities.EnderecoModel
import java.time.LocalDateTime

data class Cliente(
    val id: Long?,
    val dataAtualizacao: LocalDateTime,
    val ativo: Boolean,
    val nomeCompleto: String,
    val email: String,
    val dataNascimento: String,
    val senha: String,
    val cpf: String,
    val enderecos: List<EnderecoModel>,
    val cartoes: List<CartaoCreditoModel>,
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
        enderecos = this.enderecos ?: emptyList(),
        cartoes = this.cartoes ?: emptyList(),
        dataAtualizacao = this.dataAtualizacao ?: LocalDateTime.now(),
        ativo = this.ativo ?: false,
        tipoCliente = this.tipoCliente,
        roles = this.roles,
    )
}