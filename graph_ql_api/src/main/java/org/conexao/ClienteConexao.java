package org.conexao;


import java.util.List;
import java.util.Optional;

import org.entity.Cliente;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;

@RequestScoped
public class ClienteConexao implements IClienteConexao {

	@Inject
	private IClienteCrudRepo clienteCrud;
	
	@Override
	public Cliente save(Cliente cliente) {
		return clienteCrud.save(cliente);
	}
	
	@Override
	public Optional<Cliente> getClienteById(Long id) {
		return clienteCrud.findById(id);
	}

	@Override
	public List<Cliente> getAll() {
		return (List<Cliente>) clienteCrud.findAll();
	}
}
