package br.com.audivisa.solserv.model.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity()
@Table(name="tb_municipio")
public class Municipio implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="mu_id",nullable=false)
	private Integer id;
	
	@Column(name="mu_nome",nullable=false)
	private String nome;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="UF_ID")
	private Estado estado;

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

	public Estado getUf() {
		return estado;
	}

	public void setUf(Estado uf) {
		this.estado = uf;
	}
	
	
	
}
