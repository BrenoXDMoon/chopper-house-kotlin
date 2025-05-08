package br.com.brenoxdmoon.chopper_house_kotlin.resources.mysql.cliente.entities

import br.com.brenoxdmoon.chopper_house_kotlin.domain.cliente.entities.CartaoCredito
import jakarta.persistence.Entity
import jakarta.persistence.Table
import java.time.LocalDateTime
import kotlin.String

//TODO: colocar as anotações de validação em uma classe DTO
@Entity
@Table(name = "cartao_credito")
class CartaoCreditoModel(
    val numeroCartao: String,
    val bandeira: String,
    val nomeImpresso: String,
    val validade: String,
    val codigoSeguranca: String,
) : PersistDomainEntity()

fun CartaoCreditoModel.toEntity(): CartaoCredito = CartaoCredito(
    id = this.id ?: throw IllegalArgumentException("cartao deve ser nulo ou vazio"), // TODO: incluir erro semântico
    dataAtualizacao = this.dataAtualizacao ?: LocalDateTime.now(),
    ativo = this.ativo ?: false,
    numeroCartao = this.numeroCartao,
    bandeira = this.bandeira,
    nomeImpresso = this.nomeImpresso,
    validade = this.validade,
    codigoSeguranca = this.codigoSeguranca,
)