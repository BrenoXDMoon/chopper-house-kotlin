package br.com.brenoxdmoon.chopper_house_kotlin.resources.mysql.cliente.entities

import jakarta.persistence.*

@Entity
@Table(name = "cliente")
class ClienteModel(
    private val nomeCompleto: String,

    @Column(unique = true)
    private val email: String,
    private val dataNascimento: String,

    @Embedded
    private val senha: String,
    private val cpf: String,

    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    private val enderecos: List<EnderecoModel>,

    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY, cascade = [CascadeType.ALL])
    private val cartoes: List<CartaoCreditoModel>,

    @Enumerated(EnumType.STRING)
    private val tipoCliente: String,

    private val telefone: String,

    private val roles: String,

    private val ativo: Boolean

    //TODO: incluir fluxo de carrinho
    //@OneToOne(cascade = [CascadeType.ALL])
    //private val carrinho: Carrinho,
    //@OneToMany(mappedBy = "cliente", targetEntity = Pedido::class)
    //private val pedidos: List<Pedido>
) {
}