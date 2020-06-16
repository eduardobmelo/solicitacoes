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
@Table(name="tb_cliente")
@SequenceGenerator(name="sq_tb_cliente",sequenceName="sq_tb_cliente", allocationSize = 1, initialValue = 1)
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="cl_id")
	private Integer id;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Column(name="cl_nome_razao_social",nullable=false)
	private String nomeRazaoSocial;
	
	@Column(name="cl_tipo_pessoa",nullable=false)
	@Enumerated(EnumType.STRING)
	private EnumTipoPessoa tipoPessoa;
	
	@Column(name="cl_cpf_cnpj")
	private String cpfCnpj;
	
	@Column(name="cl_email")
	private String email;
	
	@Column(name="cl_site")
	private String site;
	
	@Column(name="cl_cartorio")
	private String cartorio;
	
	@Column(name="cl_data_nascto")
	@Temporal(TemporalType.DATE)
	private Date dataNascimento;
	
	@Column(name="cl_telefone_principal")
	private String telefonePrincipal;
	
	@Column(name="cl_telefone_opcional")
	private String telefoneOpcional;
	
	@Column(name="cl_telefone_celular")
	private String telefoneCelular;
	
	@Column(name="cl_cep")
	private String cep;
	
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn(name="MU_ID")
	private Municipio municipio;
	
	@Column(name="cl_complemento")
	private String complemento;
	
	@Column(name="cl_endereco")
	private String endereco;
	
	@Column(name="cl_bairro")
	private String bairro;
	
	@Column(name="cl_numero")
	private String numero;
	
	@Column(name="cl_inscr_municipal")
	private String inscricaoMunicipal;
	
	@Column(name="cl_inscr_estadual")
	private String inscricaoEstadual;
	
	@Column(name="cl_nire")
	private String nire;
	
	public String getInscricaoMunicipal() {
		return inscricaoMunicipal;
	}
	public void setInscricaoMunicipal(String inscricaoMunicipal) {
		this.inscricaoMunicipal = inscricaoMunicipal;
	}
	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}
	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
	public String getNire() {
		return nire;
	}
	public void setNire(String nire) {
		this.nire = nire;
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
	public String getTelefoneOpcional() {
		return telefoneOpcional;
	}
	public void setTelefoneOpcional(String telefoneOpcional) {
		this.telefoneOpcional = telefoneOpcional;
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
	public String getNomeRazaoSocial() {
		return nomeRazaoSocial;
	}

	public EnumTipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}
	public void setTipoPessoa(EnumTipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}
	public String getCpfCnpj() {
		return cpfCnpj;
	}
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getCartorio() {
		return cartorio;
	}
	public void setCartorio(String cartorio) {
		this.cartorio = cartorio;
	}
	public void setNomeRazaoSocial(String nomeRazaoSocial) {
		this.nomeRazaoSocial = nomeRazaoSocial;
	}
}
