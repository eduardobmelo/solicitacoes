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
@Table(name="tb_objeto_seg")
@SequenceGenerator(name="sq_tb_objeto_seg",sequenceName="sq_tb_objeto_seg", allocationSize = 1, initialValue = 1)
public class ObjetoSeguranca implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public ObjetoSeguranca() {
	}
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="os_id")
	private Integer id;
	
	@Column(name="os_codigo",nullable=false)
	private String codigo;
	
	@Column(name="os_descricao",nullable=false)
	private String descricao;
	
	@Column(name="os_hierarquia")
	private String hierarquia;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getHierarquia() {
		return hierarquia;
	}
	public void setHierarquia(String hierarquia) {
		this.hierarquia = hierarquia;
	}
	
}
