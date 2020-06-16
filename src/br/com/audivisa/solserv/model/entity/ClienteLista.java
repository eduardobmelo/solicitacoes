package br.com.audivisa.solserv.model.entity;

import java.io.Serializable;

public class ClienteLista implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer id;
	private String nomeRazaoSocial;
	
	public ClienteLista(Integer id, String nomeRazaoSocial) {
		this.id = id;
		this.nomeRazaoSocial = nomeRazaoSocial;
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

	public void setNomeRazaoSocial(String nomeRazaoSocial) {
		this.nomeRazaoSocial = nomeRazaoSocial;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
