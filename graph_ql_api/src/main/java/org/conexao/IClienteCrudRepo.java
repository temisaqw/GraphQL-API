package org.conexao;

import java.util.Optional;

import org.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface IClienteCrudRepo extends CrudRepository<Cliente, Long>{
	public Optional<Cliente> findById(Long id);
}
