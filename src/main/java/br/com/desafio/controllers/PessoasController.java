package br.com.desafio.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafio.business.PessoasBusiness;
import br.com.desafio.models.Pessoa;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api(value = "Pessoas", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequestMapping(value = "pessoas")
public class PessoasController extends GenericController {

	@Autowired
	private PessoasBusiness pessoasBusiness;

	@ApiOperation(value = "Recuperar lista de todos os clientes.")
	@GetMapping
	public ResponseEntity<List<Pessoa>> listarTodos() {
		List<Pessoa> lista = pessoasBusiness.listarTodos();
		return ResponseEntity.ok(lista);
	}

	@ApiOperation(value = "Recuperar cadastro de pessoa.")
	@GetMapping("/{id}")
	public ResponseEntity<Pessoa> recuperarPorId(
			@ApiParam(value = "id", example = "1", type = "number", required = true) @PathVariable("id") Long id) {
		Pessoa pessoa = pessoasBusiness.recuperarPorId(id);
		return ResponseEntity.ok(pessoa);
	}

	@ApiOperation(value = "Cadastrar pessoa.")	
	@PostMapping
	public ResponseEntity<Pessoa> salvar
	(@ApiParam(value = "Pessoa") @RequestBody @Valid Pessoa pessoa) {
		pessoa = pessoasBusiness.salvarOuAtualizar(pessoa);
		return ResponseEntity.ok(pessoa);
	}

	@ApiOperation(value = "Alterar cadastro de pessoa.")
	@PutMapping("/{id}")
	public ResponseEntity<Pessoa> atualizar(@PathVariable Long id,
			@ApiParam(value = "Pessoa") @RequestBody @Valid Pessoa pessoa) {
		pessoa = pessoasBusiness.salvarOuAtualizar(pessoa);
		return ResponseEntity.ok(pessoa);
	}

	@ApiOperation(value = "Deletar cadastro de pessoa.")
	@DeleteMapping("/{id}")
	public ResponseEntity<Long> deletar(
			@ApiParam(value = "id", example = "1", type = "number", required = true) @PathVariable Long id) {
		pessoasBusiness.deletar(id);
		return ResponseEntity.ok(id);
	}

}