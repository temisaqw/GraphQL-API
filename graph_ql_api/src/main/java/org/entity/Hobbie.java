package org.entity;

import org.DTO.HobbieDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Hobbie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String nome;

	public Hobbie(HobbieDTO hobbieDTO) {
		this.id = hobbieDTO.getId();
		this.nome = hobbieDTO.getNome();
	}
}
