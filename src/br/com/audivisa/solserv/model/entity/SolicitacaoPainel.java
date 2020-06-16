package br.com.audivisa.solserv.model.entity;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import br.com.audivisa.solserv.model.util.DiaSemanaMesExtenso;

public class SolicitacaoPainel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String dataHoraAtender;
	private String descricaoSituacao;
	private String execucao;
	private Integer nivelPrioridade;
	private String cliente;
	private String solicitacao;
	private Calendar cal;

	public SolicitacaoPainel(Integer id, Date dataHoraAtender, String descricaoSituacao, 
			String execucao, Integer nivelPrioridade, String cliente, String solicitacao) {
		
		this.cal = Calendar.getInstance();
		this.cal.setTime(dataHoraAtender);
		
		this.id = id;
		
		this.dataHoraAtender = DiaSemanaMesExtenso.getDiaSemanaExtenso(cal.get(Calendar.DAY_OF_WEEK))
				+ ", " + Integer.toString(cal.get(Calendar.DAY_OF_MONTH))
				+ " DE " + DiaSemanaMesExtenso.getMesExtenso(cal.get(Calendar.MONTH))
				+ " " + Integer.toString(cal.get(Calendar.HOUR_OF_DAY)) + ":" 
				+ Integer.toString(cal.get(Calendar.MINUTE));
		
		if (descricaoSituacao.length() > 30 ) {
			this.descricaoSituacao = descricaoSituacao.substring(0, 30);
		} else {
			this.descricaoSituacao = descricaoSituacao;
		}
		
		this.execucao = execucao;
		this.nivelPrioridade = nivelPrioridade;
		
		if (cliente.length() > 30) {
			this.cliente = cliente.substring(0, 30);
		} else {
			this.cliente = cliente;
		}
		
		if (solicitacao.length() > 50) {
			this.solicitacao = solicitacao.substring(0, 50);
		} else {
			this.solicitacao = solicitacao;
		}
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDataHoraAtender() {
		return dataHoraAtender;
	}

	public void setDataHoraAtender(String dataHoraAtender) {
		this.dataHoraAtender = dataHoraAtender;
	}

	public String getDescricaoSituacao() {
		return descricaoSituacao;
	}

	public void setDescricaoSituacao(String descricaoSituacao) {
		this.descricaoSituacao = descricaoSituacao;
	}

	public String getExecucao() {
		return execucao;
	}

	public void setExecucao(String execucao) {
		this.execucao = execucao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getNivelPrioridade() {
		return nivelPrioridade;
	}

	public void setNivelPrioridade(Integer nivelPrioridade) {
		this.nivelPrioridade = nivelPrioridade;
	}
	
	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getSolicitacao() {
		return solicitacao;
	}

	public void setSolicitacao(String solicitacao) {
		this.solicitacao = solicitacao;
	}
	
	

}
