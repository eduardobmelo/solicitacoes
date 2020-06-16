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
@Table(name="tb_situacao_solic")
@SequenceGenerator(name="sq_tb_situacao_solic",sequenceName="sq_tb_situacao_solic", allocationSize = 1, initialValue = 1)
public class SituacaoSolicitacao implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="si_id")
	private Integer id;
	
	@Column(name="si_descricao",nullable=false)
	private String descricao;
	
	@Column(name="si_encerrado")
	private Boolean encerrada;
	
	public SituacaoSolicitacao() {
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Boolean getEncerrada() {
		return encerrada;
	}

	public void setEncerrada(Boolean encerrada) {
		this.encerrada = encerrada;
	}

	public Integer getId() {
		return id;
	}
}
