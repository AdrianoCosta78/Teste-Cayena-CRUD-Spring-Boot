package br.com.projetocayena.testecayena.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FornecedoresModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_fornecedor;
	@Column(nullable = false, unique = true)
	private String nome_fornecedor;
	@Column(nullable = false)
	private LocalDate data_criacao_fornecedor;
	@Column(nullable = false)
	private LocalDate data_atualizacao_fornecedor;

//	@OneToMany(mappedBy = "id_fornecedor")
//	private List<ProdutosModel> produto = new ArrayList<>();

	public long getId_fornecedor() {
		return id_fornecedor;
	}

	public void setId_fornecedor(long id_fornecedor) {
		this.id_fornecedor = id_fornecedor;
	}

	public String getNome_fornecedor() {
		return nome_fornecedor;
	}

	public void setNome_fornecedor(String nome_fornecedor) {
		this.nome_fornecedor = nome_fornecedor;
	}

	public LocalDate getData_criacao_fornecedor() {
		return data_criacao_fornecedor;
	}

	public void setData_criacao_fornecedor(LocalDate data_criacao_fornecedor) {
		this.data_criacao_fornecedor = data_criacao_fornecedor;
	}

	public LocalDate getData_atualizacao_fornecedor() {
		return data_atualizacao_fornecedor;
	}

	public void setData_atualizacao_fornecedor(LocalDate data_atualizacao_fornecedor) {
		this.data_atualizacao_fornecedor = data_atualizacao_fornecedor;
	}

}
