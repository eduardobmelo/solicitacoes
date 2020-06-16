package br.com.audivisa.solserv.model.entity;

import java.io.Serializable;

public class UsuarioLista implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private Boolean facebook;
	
	private String login;
	
	private String nomeColaborador;
	
	private EnumSituacaoUsuario situacao;
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public UsuarioLista(Integer id, Boolean facebook, String login, String nomeColaborador, EnumSituacaoUsuario situacao) {
		this.id = id;
		this.facebook = facebook;
		this.login = login;
		this.nomeColaborador = nomeColaborador;
		this.situacao = situacao;
	}

	public String getNomeColaborador() {
		return nomeColaborador;
	}

	public void setNomeColaborador(String nomeColaborador) {
		this.nomeColaborador = nomeColaborador;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Boolean getFacebook() {
		return facebook;
	}

	public void setFacebook(Boolean facebook) {
		this.facebook = facebook;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public EnumSituacaoUsuario getSituacao() {
		return situacao;
	}

	public void setSituacao(EnumSituacaoUsuario situacao) {
		this.situacao = situacao;
	}
}
