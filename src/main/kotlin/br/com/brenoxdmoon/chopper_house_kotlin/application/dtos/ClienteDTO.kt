package br.com.brenoxdmoon.chopper_house_kotlin.application.dtos

import br.com.brenoxdmoon.chopper_house_kotlin.resources.mysql.cliente.entities.CartaoCreditoModel
import br.com.brenoxdmoon.chopper_house_kotlin.resources.mysql.cliente.entities.ClienteModel
import br.com.brenoxdmoon.chopper_house_kotlin.resources.mysql.cliente.entities.EnderecoModel

data class ClienteDTO(
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
) {
//    fun toEntity(): Cliente = Cliente(
//        nome = this.nome,
//        email = this.email,
//        cpf = this.cpf,
//        telefone = this.telefone
//    )

    fun toModel(): ClienteModel = ClienteModel(
        nomeCompleto = this.nomeCompleto,
        email = this.email,
        dataNascimento = this.dataNascimento,
        senha = this.senha,
        cpf = this.cpf,
        enderecos = this.enderecos,
        cartoes = this.cartoes,
        tipoCliente = this.tipoCliente,
        telefone = this.telefone,
        roles = this.roles
    )
}