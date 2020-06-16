package br.com.audivisa.solserv.model.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity()
@Table(name="tb_usuario")
@SequenceGenerator(name="sq_tb_usuario",sequenceName="sq_tb_usuario", allocationSize = 1, initialValue = 1)
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="us_id")
	private Integer id;
	
	@Column(name="us_facebook")
	private Boolean facebook;
	
	@Column(name="us_login",nullable=false)
	private String login;
	
	@Column(name="us_senha",nullable=false)
	private String senha;
	
	@Transient
	private String senha2;
	
	@Column(name="us_data_cadastro", nullable=false)
	@Temporal(TemporalType.DATE)
	private Date dataCadastro;
	
	@OneToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn(name="cb_id")
	private Colaborador colaborador;
	
	@Column(name="us_situacao",nullable=false)
	@Enumerated(EnumType.STRING)
	private EnumSituacaoUsuario situacao;
	
	@Transient
	private List<UsuarioPapel> papeis;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Date getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	public Colaborador getColaborador() {
		return colaborador;
	}
	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}
	public EnumSituacaoUsuario getSituacao() {
		return situacao;
	}
	public void setSituacao(EnumSituacaoUsuario situacao) {
		this.situacao = situacao;
	}

	public String getSenha2() {
		return senha2;
	}

	public void setSenha2(String senha2) {
		this.senha2 = senha2;
	}
	public Boolean getFacebook() {
		return facebook;
	}
	public void setFacebook(Boolean facebook) {
		this.facebook = facebook;
	}
	public List<UsuarioPapel> getPapeis() {
		return papeis;
	}
	public void setPapeis(List<UsuarioPapel> lista) {
		this.papeis = lista;
	}
	
	
}
