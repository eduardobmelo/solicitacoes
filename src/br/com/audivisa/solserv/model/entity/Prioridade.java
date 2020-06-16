package br.com.audivisa.solserv.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity()
@Table(name="tb_prioridade_solic")
@SequenceGenerator(name="sq_tb_prioridade",sequenceName="sq_tb_prioridade", allocationSize = 1, initialValue = 1)

public class Prioridade implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pr_id")
	private Integer id;
	
	@Column(name="pr_descricao",nullable=false)
	private String descricao;
	
	@Column(name="pr_nivel",nullable=false)
	private Integer nivel;
	
	public Prioridade() {
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNivel() {
		return nivel.toString();
	}

	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

	public Integer getId() {
		return id;
	}
	
	

}
