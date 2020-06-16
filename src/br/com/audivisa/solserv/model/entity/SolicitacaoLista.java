package br.com.audivisa.solserv.model.entity;

import java.io.Serializable;
import java.util.Date;

public class SolicitacaoLista implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	public SolicitacaoLista(String titulo, Date dataHoraSolicitacao, String execucao, String colaborador, String situacao, Integer id) {
		this.titulo = titulo;
		this.dataHoraSolicitacao = dataHoraSolicitacao;
		this.execucao = execucao;
		this.colaborador = colaborador;
		this.situacao = situacao;
		this.id = id;
	}

	private String titulo;
	private Date dataHoraSolicitacao;
	private String execucao;
	private String colaborador;
	private String situacao;
	private Integer id;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Date getDataHoraSolicitacao() {
		return dataHoraSolicitacao;
	}
	public void setDataHoraSolicitacao(Date dataHoraSolicitacao) {
		this.dataHoraSolicitacao = dataHoraSolicitacao;
	}
	public String getExecucao() {
		return execucao;
	}
	public void setExecucao(String execucao) {
		this.execucao = execucao;
	}
	public String getColaborador() {
		return colaborador;
	}
	public void setColaborador(String colaborador) {
		this.colaborador = colaborador;
	}
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
