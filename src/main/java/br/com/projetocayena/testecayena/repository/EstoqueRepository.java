package br.com.projetocayena.testecayena.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.projetocayena.testecayena.model.ProdutosModel;

@Repository
public interface EstoqueRepository extends JpaRepository<ProdutosModel, Long> {

}
