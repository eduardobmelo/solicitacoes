package br.com.audivisa.solserv.model.entity;

public class GraficoSolDash {

	private String nome;
	private Long qtd;
	
	public GraficoSolDash(String nome, Long qtd) {
		this.nome = nome;
		this.qtd = qtd;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Long getQtd() {
		return qtd;
	}

	public void setQtd(Long qtd) {
		this.qtd = qtd;
	}
	
	
}
