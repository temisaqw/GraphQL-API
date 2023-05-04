package org.DTO;

import java.util.ArrayList;
import java.util.List;

import org.entity.Cliente;
import org.entity.Hobbie;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ClienteDTO {


	private Long id;
	private String nome;
	private List<HobbieDTO> hobbies = new ArrayList<>();
	
	public ClienteDTO(Cliente cliente) {
		this.id = cliente.getId();
		this.nome = cliente.getNome();
		for (Hobbie hobbie : cliente.getHobbies()) {
			this.hobbies.add(new HobbieDTO(hobbie));
		}
	}
}
