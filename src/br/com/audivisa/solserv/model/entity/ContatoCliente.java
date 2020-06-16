package br.com.audivisa.solserv.model.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity()
@Table(name="tb_cliente_contato", schema="public")
@SequenceGenerator(name="sq_tb_cliente_contato",sequenceName="sq_tb_cliente_contato", allocationSize = 1, initialValue = 1)
public class ContatoCliente implements Serializable {

	private static final long serialVersionUID = 1L;

	@JsonIgnoreProperties
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="co_id")
	private Integer id;
	
	@Column(name="co_nome",nullable=false)
	private String nome;
	
	@JsonIgnoreProperties
	@Column(name="co_email")
	private String email;
	
	@JsonIgnoreProperties
	@Column(name="co_data_nascto")
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
	
	@JsonIgnoreProperties
	@Column(name="co_telefone_principal")
	private String telefonePrincipal;
	
	@JsonIgnoreProperties
	@Column(name="co_telefone_celular")
	private String telefoneCelular;
	
	@JsonIgnoreProperties
	@Column(name="co_vinculo_funcao")
	private String vinculoFuncao;

	@Column(name="cl_id")
	private Integer idCliente;
	
	@JsonIgnoreProperties
	@Column(name="co_cep")
	private String cep;
	
	@JsonIgnoreProperties
	@ManyToOne(fetch=FetchType.LAZY, optional=true)
	@JoinColumn(name="mu_id")
	private Municipio municipio;
	
	@JsonIgnoreProperties
	@Column(name="co_complemento")
	private String complemento;
	
	@JsonIgnoreProperties
	@Column(name="co_endereco")
	private String endereco;
	
	@JsonIgnoreProperties
	@Column(name="co_bairro")
	private String bairro;
	
	@JsonIgnoreProperties
	@Column(name="co_numero")
	private String numero;
	
	@JsonIgnoreProperties
	@Column(name="co_rg")
	private String rg;
	
	@JsonIgnoreProperties
	@Column(name="co_cpf")
	private String cpf;
	
	@JsonIgnoreProperties
	@Column(name="co_conjuge")
	private String conjuge;
	
	@JsonIgnoreProperties
	@Column(name="co_estado_civil")
	@Enumerated(EnumType.STRING)
	private EnumEstadoCivil estadoCivil;
	
	@JsonIgnoreProperties
	@Column(name="co_cartorio")
	private String cartorio;
	
	@JsonIgnoreProperties
	@Column(name="co_responsavel")
	private Boolean responsavel;
	
	public Boolean getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Boolean responsavel) {
		this.responsavel = responsavel;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getConjuge() {
		return conjuge;
	}

	public void setConjuge(String conjuge) {
		this.conjuge = conjuge;
	}

	public EnumEstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EnumEstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public String getCartorio() {
		return cartorio;
	}

	public void setCartorio(String cartorio) {
		this.cartorio = cartorio;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getVinculoFuncao() {
		return vinculoFuncao;
	}

	public void setVinculoFuncao(String vinculoFuncao) {
		this.vinculoFuncao = vinculoFuncao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getTelefonePrincipal() {
		return telefonePrincipal;
	}

	public void setTelefonePrincipal(String telefonePrincipal) {
		this.telefonePrincipal = telefonePrincipal;
	}

	public String getTelefoneCelular() {
		return telefoneCelular;
	}

	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}
	
	
}
