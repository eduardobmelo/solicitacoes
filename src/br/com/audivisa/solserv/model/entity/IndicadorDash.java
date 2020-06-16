package br.com.audivisa.solserv.model.entity;

public class IndicadorDash {

	private String descricao;
	private Long numero;
	private String classeImagem;
	private String corPainel;
	
	public IndicadorDash(String d, Long n, String c, String x) {
		descricao = d;
		numero = n;
		classeImagem = c;
		corPainel = x;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Long getNumero() {
		return numero;
	}
	public void setNumero(Long numero) {
		this.numero = numero;
	}
	
	public String getClasseImagem() {
		return classeImagem;
	}

	public void setClasseImagem(String classeImagem) {
		this.classeImagem = classeImagem;
	}

	public String getCorPainel() {
		return corPainel;
	}

	public void setCorPainel(String corPainel) {
		this.corPainel = corPainel;
	}
}
