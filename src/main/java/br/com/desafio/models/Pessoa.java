package br.com.desafio.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@ApiModel(value = "Pessoa", description = "Modelo Pessoa")
@Data
@Builder
@AllArgsConstructor
@Entity
@Table(name = "PESSOAS")
public class Pessoa {
	
	
	@Id
	@ApiModelProperty(notes = "Id da pessoa", dataType = "number", name="id", value = "12")
	@Column(name = "CD_PESSOAS", nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ApiModelProperty(notes = "Nome da pessoa", dataType = "string", name="nome", value = "Lázaro")
	@Column(name = "NM_PESSOAS")
	private String nome;
	
	@ApiModelProperty(notes = "Sexo da pessoa (M,F,I)", dataType = "string", name="sexo", value = "M")
	@Column(name = "TP_SEXO")
	private String sexo;
	
	@ApiModelProperty(notes = "E-mail da pessoa", dataType = "string", name="email", value = "lazaro@email.com")
	@Column(name = "DS_EMAIL")
	private String email;
	
	@ApiModelProperty(notes = "Data de nascimento da pessoa", dataType = "string", name="dataNascimento", value = "20/11/1987")
	@Column(name = "DT_NASCIMENTO", nullable = false)
	private Date dataNascimento;
	
	@ApiModelProperty(notes = "Naturalidade da pessoa", dataType = "string", name="naturalidade", value = "Fortaleza")
	@Column(name = "DS_NATURALIDADE")
	private String naturalidade;
	
	@ApiModelProperty(notes = "Nacionalidade da pessoa", dataType = "string", name="nacionalidade", value = "Brasileira")
	@Column(name = "DS_NACIONALIDADE")
	private String nacionalidade;
	
	@ApiModelProperty(notes = "Nacionalidade da pessoa", dataType = "string", name="cpf", value = "98775323412")
	@Column(name = "NR_CPF",unique = true)
	@NotBlank
	private String cpf;
	
	public Pessoa() {
		super();
	}
}
