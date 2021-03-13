package br.com.desafio.models;

import java.util.Date;

import lombok.Data;

@Data
public class TesteImagem {

	private String nome;
	private Date dataNascimento;
	private byte[] imagem;
}
