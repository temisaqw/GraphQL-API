package org.service;

import java.util.List;

import org.DTO.ClienteDTO;

public interface IService {

	void cadastrarCliente(ClienteDTO clienteDTO);

	ClienteDTO getCLienteById(Long id);

	List<ClienteDTO> getClientes();
}
