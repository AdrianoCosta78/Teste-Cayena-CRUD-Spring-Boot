package br.com.projetocayena.testecayena;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetocayena.testecayena.model.FornecedoresModel;
import br.com.projetocayena.testecayena.repository.FornecedoresRepository;

@RestController
@RequestMapping("/fornecedores")
public class FornecedoresController {

	@Autowired
	private FornecedoresRepository fornecedoresRepository;

	@GetMapping
	public List<FornecedoresModel>listar(){
		List<FornecedoresModel> fornecedoresModel = fornecedoresRepository.findAll();
		return fornecedoresModel;
	}
	
	@GetMapping("/{id_fornecedor}")
	public FornecedoresModel buscar(@PathVariable Long id_fornecedor) {
		Optional<FornecedoresModel> resultado = fornecedoresRepository.findById(id_fornecedor);
		FornecedoresModel fornecedoresModel = resultado.get();
		return fornecedoresModel;
	}
	
	
	@PostMapping
	public FornecedoresModel inserir(@RequestBody FornecedoresModel fornecedoresModel) {
		FornecedoresModel fornecedoresSalvar = fornecedoresRepository.save(fornecedoresModel);
		return fornecedoresSalvar;
	}


	@PutMapping
	public FornecedoresModel editar(@RequestBody FornecedoresModel fornecedoresModel) {
		FornecedoresModel fornecedoresEditado = fornecedoresRepository.save(fornecedoresModel);
		return fornecedoresEditado;
	}

	@DeleteMapping("/{id_fornecedor}")
	public Optional<FornecedoresModel> excluir(@PathVariable Long id_fornecedor) {
		Optional<FornecedoresModel> fornecedoresModel = fornecedoresRepository.findById(id_fornecedor);
		fornecedoresRepository.delete(fornecedoresModel.get());
		return fornecedoresModel;
		
	}

}


