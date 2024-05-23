package com.projetojpa.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table (name = "Funcionario")
public class Funcionario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	@Column (name = "cpf", nullable = false)
	private String cpf;
	
	@NotNull
	@Column (name = "salario", nullable = false)
	private double salario;
	
	@NotBlank
	@Column (name = "nome", nullable = false)
	private String nome;
	
	@NotBlank
	@Column (name = "telefone", nullable = false)
	private String telefone;
	
	@ManyToOne
	@JoinColumn(name = "id_departamento", nullable = false)
	private Departamento departamento;
}