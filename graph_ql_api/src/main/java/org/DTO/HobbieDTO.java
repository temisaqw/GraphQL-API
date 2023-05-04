package org.DTO;

import org.entity.Hobbie;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class HobbieDTO {
	private Long id;
	private String nome;
	

	public HobbieDTO(Hobbie hobbie) {
		this.id = hobbie.getId();
		this.nome = hobbie.getNome();
	}
}
