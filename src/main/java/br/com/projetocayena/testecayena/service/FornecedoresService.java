package br.com.projetocayena.testecayena.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import br.com.projetocayena.testecayena.model.FornecedoresModel;
import br.com.projetocayena.testecayena.repository.FornecedoresRepository;

@Service
public class FornecedoresService {
	@Autowired
	private FornecedoresRepository fornecedoresRepository;

	
	public FornecedoresModel buscarPorCodigo(Long id_fornecedor) {
		Optional<FornecedoresModel> resultado = fornecedoresRepository.findById(id_fornecedor);
		if(resultado.isEmpty()) {
			throw new RuntimeException("Fornecedor não encontrado");
		}
		FornecedoresModel fornecedoresModel = resultado.get();
		return fornecedoresModel;
	}
}
