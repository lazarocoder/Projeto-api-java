package br.com.desafio.controllers;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.desafio.models.TesteImagem;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@CrossOrigin("*")
@Api(value = "TesteImagem", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
@RestController
@RequestMapping(value = "testeImagem")
public class TesteImagemController extends GenericController{

	@ApiOperation(value = "Get Teste.")
	@GetMapping
	public ResponseEntity<String> get() {
		return ResponseEntity.ok("Olá Mundo");
	}
	
	@ApiOperation(value = "Post Teste.")
	@PostMapping
	public ResponseEntity<TesteImagem> post(@ApiParam(value = "TesteImagem") @RequestBody TesteImagem testeImagem) {
		System.out.println(testeImagem.getNome());
		return ResponseEntity.ok(testeImagem);
	}


}
