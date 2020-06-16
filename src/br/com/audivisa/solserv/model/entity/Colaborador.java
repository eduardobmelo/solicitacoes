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

@Entity()
@Table(name="tb_colaborador")
@SequenceGenerator(name="sq_tb_colaborador",sequenceName="sq_tb_colaborador", allocationSize = 1, initialValue = 1)
public class Colaborador implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cb_id")
	private Integer id;
	
	@Column(name="cb_nome",nullable=false)
	private String nome;
	
	@Column(name="cb_data_nascto")
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
	
	@Column(name="cb_vinculo_funcao",nullable=false)
	private String vinculoFuncao;
	
	@Column(name="cb_data_admissao")
	@Temporal(TemporalType.DATE)
	private Date dataAdmissao;
	
	@Column(name="cb_data_demissao")
	@Temporal(TemporalType.DATE)
	private Date dataDemissao;
	
	@Column(name="cb_cpf")
	private String cpf;
	
	@Column(name="cb_telefone_principal")
	private String telefonePrincipal;
	
	@Column(name="cb_telefone_celular")
	private String telefoneCelular;
	
	@Column(name="cb_email")
	private String email;
	
	@Column(name="cb_cep")
	private String cep;
	
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn(name="mu_id")
	private Municipio municipio;
	
	@Column(name="cb_complemento")
	private String complemento;
	
	@Column(name="cb_endereco")
	private String endereco;
	
	@Column(name="cb_bairro")
	private String bairro;
	
	@Column(name="cb_numero")
	private String numero;
	
	@Column(name="cb_situacao",nullable=false)
	@Enumerated(EnumType.STRING)
	private EnumSituacaoColaborador situacao;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
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
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
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

	public String getTipoPessoa() {
		return vinculoFuncao;
	}
	public void setTipoPessoa(String vinculoFuncao) {
		this.vinculoFuncao = vinculoFuncao;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getVinculoFuncao() {
		return vinculoFuncao;
	}
	public void setVinculoFuncao(String vinculoFuncao) {
		this.vinculoFuncao = vinculoFuncao;
	}
	public Date getDataAdmissao() {
		return dataAdmissao;
	}
	public void setDataAdmissao(Date dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}
	public Date getDataDemissao() {
		return dataDemissao;
	}
	public void setDataDemissao(Date dataDemissao) {
		this.dataDemissao = dataDemissao;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public EnumSituacaoColaborador getSituacao() {
		return situacao;
	}
	public void setSituacao(EnumSituacaoColaborador situacao) {
		this.situacao = situacao;
	}
	
	
}
