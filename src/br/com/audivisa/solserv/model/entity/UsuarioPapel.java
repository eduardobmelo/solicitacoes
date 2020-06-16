package br.com.audivisa.solserv.model.entity;

import java.io.Serializable;
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

@Entity()
@Table(name="tb_usuario_papel")
@SequenceGenerator(name="sq_tb_usuario_papel",sequenceName="sq_tb_usuario_papel", allocationSize = 1, initialValue = 1)
public class UsuarioPapel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="up_id")
	private Integer id;
	
	@ManyToOne(fetch=FetchType.LAZY, optional=false)
	@JoinColumn(name="ps_id")
	private PapelSeguranca papel;
	
	@Column(name="us_id")
	private Integer idUsuario;
	
	@Column(name="up_permissao")
	private Boolean permissao;
	
	public UsuarioPapel() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public PapelSeguranca getPapel() {
		return papel;
	}

	public void setPapel(PapelSeguranca papel) {
		this.papel = papel;
	}

	public Integer getUsuario() {
		return idUsuario;
	}

	public void setUsuario(Integer usuario) {
		this.idUsuario = usuario;
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
