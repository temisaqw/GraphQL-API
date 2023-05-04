package org.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.DTO.ClienteDTO;
import org.conexao.IClienteConexao;
import org.entity.Cliente;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

public class Service implements IService {

	private IClienteConexao iClienteConexao;
	
	public Service(final IClienteConexao iClienteConexao) {
		this.iClienteConexao = iClienteConexao;
	}

	@Override
	public void cadastrarCliente(ClienteDTO clienteDTO) {
		iClienteConexao.save(new Cliente(clienteDTO));
	}

	@Override
	public ClienteDTO getCLienteById(Long id) {
		Optional<Cliente> cliente = iClienteConexao.getClienteById(id);
		if (cliente.isPresent()) {
			return new ClienteDTO(cliente.get());
		}
		return null;
	}

	@Override
	public List<ClienteDTO> getClientes() {
		List<Cliente> clientes = iClienteConexao.getAll();
		List<ClienteDTO> clientesDTO = new ArrayList<>();
		for(Cliente cliente : clientes) {
			clientesDTO.add(new ClienteDTO(cliente));
		}
		return clientesDTO;
	}
}
