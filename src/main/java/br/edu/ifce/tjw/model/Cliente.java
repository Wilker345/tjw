package br.edu.ifce.tjw.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.*;

/**
 * @author cjunior
 *
 */
@Entity
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private String cpf;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtCadastro;
	@Temporal(TemporalType.DATE)
	private Date dtNascimento;
	@Transient
	private int idade;
	@OneToMany(mappedBy = "cliente")
	private List<Telefone> telefones;

	@OneToMany(mappedBy = "cliente")
	private List<Pedido> pedidos;

	@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
	private List<EnderecoCliente> enderecos;

	public Cliente(String nome, String cpf, Date dtCadastro, Date dtNascimento, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.dtCadastro = dtCadastro;
		this.dtNascimento = dtNascimento;
		this.idade = idade;
	}

	public Cliente() {
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Date getDtCadastro() {
		return dtCadastro;
	}
	public void setDtCadastro(Date dtCadastro) {
		this.dtCadastro = dtCadastro;
	}
	public Date getDtNascimento() {
		return dtNascimento;
	}
	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}
	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public List<EnderecoCliente> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<EnderecoCliente> enderecos) {
		this.enderecos = enderecos;
	}
}
