package br.com.audivisa.solserv.model.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity()
@Table(name="tb_estado")
public class Estado implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="uf_id",nullable=false)
	private String id;
	
	@Column(name="uf_nome",nullable=false)
	private String nome;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
