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

import br.com.projetocayena.testecayena.model.ProdutosModel;
import br.com.projetocayena.testecayena.repository.EstoqueRepository;

@RestController
@RequestMapping("/produtos")
public class EstoqueController {

	@Autowired
	private EstoqueRepository estoqueRepository;

	@GetMapping
	public List<ProdutosModel> listar() {
		List<ProdutosModel> produtosModel = estoqueRepository.findAll();
		return produtosModel;
	}

	@GetMapping("/{id}")
	public ProdutosModel buscarPorId(@PathVariable Long id) {
		Optional<ProdutosModel> resultado = estoqueRepository.findById(id);
		ProdutosModel produtosModel = resultado.get();
		return produtosModel;
	}

	@PostMapping
	public ProdutosModel inserir(@RequestBody ProdutosModel produtosModel) {
		ProdutosModel produtosSalvar = estoqueRepository.save(produtosModel);
		return produtosSalvar;
	}

	@PutMapping
	public ProdutosModel editar(@RequestBody ProdutosModel produtosModel) {
		ProdutosModel produtosEditado = estoqueRepository.save(produtosModel);
		return produtosEditado;
	}

	@DeleteMapping("/{id}")
	public Optional<ProdutosModel> excluir(@PathVariable Long id) {
		Optional<ProdutosModel> produtosModel = estoqueRepository.findById(id);
		estoqueRepository.delete(produtosModel.get());
		return produtosModel;

	}

}
