package br.com.audivisa.solserv.model.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity()
@Table(name="tb_papel_seg")
@SequenceGenerator(name="sq_tb_papel_seg",sequenceName="sq_tb_papel_seg", allocationSize = 1, initialValue = 1)
public class PapelSeguranca implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ps_id")
	private Integer id;
	
	@Column(name="ps_descricao",nullable=false)
	private String descricao;
	
	@Column(name="ps_nome",nullable=false)
	private String nome;
	
	@Transient
    private List<PermissaoSeguranca> permissoes;
	
	public List<PermissaoSeguranca> getPermissoes() {
		return permissoes;
	}

	public void setPermissoes(List<PermissaoSeguranca> permissoes) {
		this.permissoes = permissoes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public PapelSeguranca() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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
}
