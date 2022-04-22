package br.com.projetocayena.testecayena.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ProdutosModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable = false)
	private String nome_produto;
	@Column(nullable = false)
	private Byte quantidade_produto;
	@Column(nullable = false, precision = 6, scale = 2)
	private BigDecimal preco_produto;
	@Column(nullable = false)
	private LocalDate data_criacao;
	@Column(nullable = false)
	private LocalDate data_atualizacao;
	
	@ManyToOne
	@JoinColumn(name="id_fornecedor")
	private FornecedoresModel fornecedoresModel;

	
	
	public FornecedoresModel getFornecedoresModel() {
		return fornecedoresModel;
	}

	public void setFornecedoresModel(FornecedoresModel fornecedoresModel) {
		this.fornecedoresModel = fornecedoresModel;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome_produto() {
		return nome_produto;
	}

	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
	}

	public Byte getQuantidade_produto() {
		return quantidade_produto;
	}

	public void setQuantidade_produto(Byte quantidade_produto) {
		this.quantidade_produto = quantidade_produto;
	}

	public BigDecimal getPreco_produto() {
		return preco_produto;
	}

	public void setPreco_produto(BigDecimal preco_produto) {
		this.preco_produto = preco_produto;
	}

	public LocalDate getData_criacao() {
		return data_criacao;
	}

	public void setData_criacao(LocalDate data_criacao) {
		this.data_criacao = data_criacao;
	}

	public LocalDate getData_atualizacao() {
		return data_atualizacao;
	}

	public void setData_atualizacao(LocalDate data_atualizacao) {
		this.data_atualizacao = data_atualizacao;
	}

	
	



}
