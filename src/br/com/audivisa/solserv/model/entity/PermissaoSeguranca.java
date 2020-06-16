package br.com.audivisa.solserv.model.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity()
@Table(name="tb_permissao_seg")
@SequenceGenerator(name="sq_tb_permissao_seg",sequenceName="sq_tb_permissao_seg", allocationSize = 1, initialValue = 1)
public class PermissaoSeguranca implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="pe_id")
	private Integer id;
	
	@Column(name="ps_id",nullable=false)
	private Integer idPapel;
	
	@OneToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn(name="os_id")
	private ObjetoSeguranca objeto;
	
	@Column(name="pe_permissao",nullable=false)
	private Boolean permissao;
	
	public PermissaoSeguranca() {
	}

	public ObjetoSeguranca getObjeto() {
		return objeto;
	}

	public void setObjeto(ObjetoSeguranca objeto) {
		this.objeto = objeto;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdPapel() {
		return idPapel;
	}

	public void setIdPapel(Integer idPapel) {
		this.idPapel = idPapel;
	}

	
	public Boolean getPermissao() {
		return permissao;
	}

	public void setPermissao(Boolean permissao) {
		this.permissao = permissao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
