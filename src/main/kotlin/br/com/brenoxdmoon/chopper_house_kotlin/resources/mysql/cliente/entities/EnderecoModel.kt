package br.com.brenoxdmoon.chopper_house_kotlin.resources.mysql.cliente.entities

import br.com.brenoxdmoon.chopper_house_kotlin.domain.cliente.entities.Endereco
import jakarta.persistence.*
import java.time.LocalDateTime

//TODO: colocar as anotações de validação em uma classe DTO
@Entity
@Table(name = "endereco")
class EnderecoModel(
    val logradouro: String,
    val numero: String,
    val cep: String,
    val complemento: String? = null,
    val cidade: String,
    val estado: String,
    val tipoEndereco: String,
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_id")
    val cliente: ClienteModel
) : PersistDomainEntity()

fun EnderecoModel.toEntity(): Endereco = Endereco(
    id = this.id ?: throw IllegalArgumentException("cartao deve ser nulo ou vazio"), // TODO: incluir erro semântico,
    dataAtualizacao = this.dataAtualizacao ?: LocalDateTime.now(),
    ativo = this.ativo ?: false,
    logradouro = this.logradouro,
    numero = this.numero,
    cep = this.cep,
    complemento = this.complemento,
    cidade = this.cidade,
    estado = this.estado,
    tipoEndereco = this.tipoEndereco,
)