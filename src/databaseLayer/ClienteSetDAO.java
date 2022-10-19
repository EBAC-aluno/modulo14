/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package databaseLayer;

import java.util.HashSet;
import java.util.Set;
import pojo.domain.Client;

public class ClienteSetDAO implements IClienteDAO {
    
    private Set<Client> set;
    
    public ClienteSetDAO() {
        this.set = new HashSet<>();
    }

    @Override
    public Boolean cadastrar(Client cliente) {
        return this.set.add(cliente);
    }

    @Override
    public void excluir(Long cpf) {
        Client clienteEncontrato = null;
        for (Client cliente : this.set) {
            if (cliente.getCpf().equals(cpf)) {
                clienteEncontrato = cliente;
                break;
            }
        }
        
        if (clienteEncontrato != null) {
            this.set.remove(clienteEncontrato);
        }
    }

    @Override
    public void alterar(Client cliente) {
        if (this.set.contains(cliente)) {
            for (Client clienteCadastrado : this.set) {
                if (clienteCadastrado.equals(cliente)) {
                    clienteCadastrado.setName(cliente.getName());
                    clienteCadastrado.setTelephone(cliente.getTelephone());
                    clienteCadastrado.setHouseNumber(cliente.getHouseNumber());
                    clienteCadastrado.setStreetAddress(cliente.getStreetAddress());
                    clienteCadastrado.setCity(cliente.getCity());
                    clienteCadastrado.setEstate(cliente.getEstate());
                    break;
                }
            }
        }
    }

    @Override
    public Client consultar(Long cpf) {
        for (Client clienteCadastrado : this.set) {
             if (clienteCadastrado.getCpf().equals(cpf)) {
                 return clienteCadastrado;
             }
        }
        return null;
    }
    
}
