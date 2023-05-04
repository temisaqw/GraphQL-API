package org.config;

import org.conexao.IClienteConexao;
import org.service.Service;

import jakarta.enterprise.context.Dependent;
import jakarta.enterprise.inject.Produces;

@Dependent
public class BeanConfiguration {

    @Produces
    public Service softwareService(IClienteConexao iClienteConexao) {
        return new Service(iClienteConexao);
    }
}
