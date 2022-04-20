package br.com.projetocayena.testecayena.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projetocayena.testecayena.model.FornecedoresModel;


public interface FornecedoresRepository extends JpaRepository<FornecedoresModel, Long> {

}
