package org.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;

import org.DTO.ClienteDTO;
import org.DTO.HobbieDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String nome;
	
	@JoinColumn(name = "cliente_id")
	@OneToMany(cascade = CascadeType.ALL)
	private List<Hobbie> hobbies = new ArrayList<>();
	
	public Cliente() {};
	
	public Cliente(ClienteDTO clienteDTO) {
		this.id = clienteDTO.getId();
		this.nome = clienteDTO.getNome();
		for (HobbieDTO hobbieDTO : clienteDTO.getHobbies()) {
			this.hobbies.add(new Hobbie(hobbieDTO));
		}
	}
}
