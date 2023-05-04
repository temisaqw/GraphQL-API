package org.rest;

import jakarta.inject.Inject;

import java.util.List;

import org.DTO.ClienteDTO;
import org.eclipse.microprofile.graphql.DefaultValue;
import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Mutation;
import org.eclipse.microprofile.graphql.Name;
import org.eclipse.microprofile.graphql.Query;
import org.service.IService;

@GraphQLApi
public class HelloGraphQLResource {

	@Inject
	private IService iService;

    @Query
    @Description("Say hello")
    public String sayHello(@DefaultValue("World") String name) {
        return "Hello " + name;
    }
    
    @Query
    public List<ClienteDTO> getClientes(){
    	return iService.getClientes();
    }
    
    @Query
    public ClienteDTO getClienteById(@Name("clienteId") Long id) {
    	return iService.getCLienteById(id);
    }
    
    @Mutation
    public ClienteDTO cadastrarCliente(ClienteDTO clienteDTO) {
    	iService.cadastrarCliente(clienteDTO);
    	return clienteDTO;
    }
}