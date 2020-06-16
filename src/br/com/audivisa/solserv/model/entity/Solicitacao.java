package br.com.audivisa.solserv.model.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity()
@Table(name="tb_solicitacao")
@SequenceGenerator(name="sq_tb_solicitacao",sequenceName="sq_tb_solicitacao", allocationSize = 1, initialValue = 1)
@JsonIgnoreProperties(value = { "handler", "hibernateLazyInitializer" })
public class Solicitacao implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public Solicitacao() {}
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="so_id")
	private Integer id;
	
	@Column(name="so_nome_solicitante")
	private String solicitante;
	
	@Column(name="so_dthr_solicitacao")
	private Date dataHoraSolicitacao;
	
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn(name="cl_id")
	private Cliente cliente;
	
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn(name="pr_id")
	private Prioridade prioridade;
	
	@Column(name="so_dthr_atender")
	private Date dataHoraAtender;
	
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn(name="cb_id")
	private Colaborador colaborador;
	
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn(name="si_id")
	private SituacaoSolicitacao situacao;
	
	@Column(name="so_dthr_atendimento")
	private Date dataHoraAtendimento;
	
	@Column(name="so_descricao_solic")
	private String solicitacao;
	
	@Column(name="so_observacao")
	private String observacao;
	
	@Column(name="so_execucao")
	private String execucao;
	
	@Column(name="so_titulo")
	private String titulo;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getExecucao() {
		return execucao;
	}

	public void setExecucao(String execucao) {
		this.execucao = execucao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(String solicitante) {
		this.solicitante = solicitante;
	}

	public Date getDataHoraSolicitacao() {
		return dataHoraSolicitacao;
	}

	public void setDataHoraSolicitacao(Date dataHoraSolicitacao) {
		this.dataHoraSolicitacao = dataHoraSolicitacao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Prioridade getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(Prioridade prioridade) {
		this.prioridade = prioridade;
	}

	public Date getDataHoraAtender() {
		return dataHoraAtender;
	}

	public void setDataHoraAtender(Date dataHoraAtender) {
		this.dataHoraAtender = dataHoraAtender;
	}

	public Colaborador getColaborador() {
		return colaborador;
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}

	public SituacaoSolicitacao getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoSolicitacao situacao) {
		this.situacao = situacao;
	}

	public Date getDataHoraAtendimento() {
		return dataHoraAtendimento;
	}

	public void setDataHoraAtendimento(Date dataHoraAtendimento) {
		this.dataHoraAtendimento = dataHoraAtendimento;
	}

	public String getSolicitacao() {
		return solicitacao;
	}

	public void setSolicitacao(String solicitacao) {
		this.solicitacao = solicitacao;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
