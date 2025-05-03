package br.com.brenoxdmoon.chopper_house_kotlin.resources.mysql.cliente.entities

import br.com.brenoxdmoon.chopper_house_kotlin.domain.cliente.entities.Cliente
import jakarta.persistence.CascadeType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.FetchType
import jakarta.persistence.OneToMany
import jakarta.persistence.Table
import java.time.LocalDateTime

@Entity
@Table(name = "clientes")
class ClienteModel(
    @Column(name = "nome_completo")
    val nomeCompleto: String,
    @Column(unique = true)
    val email: String,
    @Column(name = "cpf", nullable = false, unique = true, length = 11)
    val cpf: String,
    val telefone: String,
    @Column(name = "data_nascimento")
    val dataNascimento: String,
    val senha: String,
    @OneToMany(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    val enderecos: List<EnderecoModel>? = null,
    @OneToMany(fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    val cartoes: List<CartaoCreditoModel>? = null,
    @Column(name = "tipo_cliente")
    val tipoCliente: String,
    val roles: String,
) : PersistDomainEntity() {
    fun toEntity(): Cliente = Cliente(
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



