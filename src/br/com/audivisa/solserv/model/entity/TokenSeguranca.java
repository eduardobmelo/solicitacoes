package br.com.audivisa.solserv.model.entity;

import java.io.Serializable;

public class TokenSeguranca implements Serializable {

	private static final long serialVersionUID = 1L;
	private String token;
	private Integer uid;
	private String un;
	private Boolean authenticated;
	private Integer cid;
	
	public TokenSeguranca(String token, Integer uid, String un, String authenticated, Integer cid) {
		this.token = token;
		this.uid = uid;
		this.un = un;
		this.authenticated = new Boolean(authenticated);
		this.cid = cid;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUn() {
		return un;
	}

	public void setUn(String un) {
		this.un = un;
	}

	public Boolean getAuthenticated() {
		return authenticated;
	}

	public void setAuthenticated(Boolean authenticated) {
		this.authenticated = authenticated;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}
}
