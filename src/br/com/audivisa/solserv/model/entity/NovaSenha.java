package br.com.audivisa.solserv.model.entity;

import java.io.Serializable;

public class NovaSenha implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String senha;
	
	public NovaSenha() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
