package org.conexao;

import java.util.List;
import java.util.Optional;

import org.DTO.ClienteDTO;
import org.entity.Cliente;

public interface IClienteConexao {

	public Cliente save(Cliente cliente);

	Optional<Cliente> getClienteById(Long id);

	public List<Cliente> getAll();
}
