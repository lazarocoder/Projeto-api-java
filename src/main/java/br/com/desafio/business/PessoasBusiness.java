package br.com.desafio.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.desafio.generic.GenericBusiness;
import br.com.desafio.models.Pessoa;
import br.com.desafio.repositories.PessoasRepository;

@Service
public class PessoasBusiness extends GenericBusiness<Pessoa, Long> {

	@Autowired
	private PessoasRepository repository;
	
	public PessoasBusiness(PessoasRepository repository) {
		super(repository);
		this.repository = repository;
	}
	
}
