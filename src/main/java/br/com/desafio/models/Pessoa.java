package br.com.desafio.models;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.sun.istack.NotNull;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@ApiModel(value = "Pessoa", description = "Modelo Pessoa")
@Data
@Builder
@JsonPropertyOrder({"name", "title", "description"})
@AllArgsConstructor
@Entity
@Table(name = "PESSOAS")
public class Pessoa {
	
	
	@Id
	@ApiModelProperty(notes = "Id da pessoa", dataType = "number", name="id", value = "12")
	@Column(name = "CD_PESSOAS")
	// @NotNull
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ApiModelProperty(notes = "Nome da pessoa", dataType = "string", name="nome", value = "Jefferey Toy")
	@Column(name = "NM_PESSOAS")
	@NotBlank
	private String nome;
	
	@ApiModelProperty(notes = "Carreira da pessoa", dataType = "string", name="carreira", value = "Human Quality Supervisor")
	@Column(name = "DS_CARREIRA")
	private String carreira;
	
	
//	@ApiModelProperty(notes = "Carreira da pessoa", dataType = "string", name = "carreira", value = "Human Quality Supervisor")
//	@Column(name = "DS_CARREIRA")
//	private String carreira;
//
//	@ApiModelProperty(notes = "Carreira da pessoa", dataType = "string", name = "carreira", value = "Human Quality Supervisor")
//	@Column(name = "DS_CARREIRA")
//	private String carreira;
//
//	@ApiModelProperty(notes = "Carreira da pessoa", dataType = "string", name = "carreira", value = "Human Quality Supervisor")
//	@Column(name = "DS_CARREIRA")
//	private String carreira;
//
//	@ApiModelProperty(notes = "Carreira da pessoa", dataType = "string", name = "carreira", value = "Human Quality Supervisor")
//	@Column(name = "DS_CARREIRA")
//	private String carreira;
	
	
	
	public Pessoa() {
		super();
	}
}
