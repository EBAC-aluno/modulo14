package databaseLayer;

import java.util.Map;
import java.util.TreeMap;
import pojo.domain.Client;


public class ClientMapDAO implements IClienteDAO {
    
    private Map<Long, Client> map;
    
    public ClientMapDAO() {
        map = new TreeMap<>();
    }

    @Override
    public Boolean cadastrar(Client client) {
        if (map.containsKey(client.getCpf())) {
            return false;
        }
        
        map.put(client.getCpf(), client);
        return true;
    }

    @Override
    public void excluir(Long cpf) {
        Client registeredClient = map.get(cpf);
        map.remove(registeredClient.getCpf(), registeredClient);
    }

    @Override
    public void alterar(Client client) {
        Client registeredClient = map.get(client.getCpf());
        registeredClient.setName(client.getName());
        registeredClient.setTelephone(client.getTelephone());
        registeredClient.setHouseNumber(client.getHouseNumber());
        registeredClient.setStreetAddress(client.getStreetAddress());
        registeredClient.setCity(client.getCity());
        registeredClient.setEstate(client.getEstate());
    }

    @Override
    public Client consultar(Long cpf) {
        return this.map.get(cpf);
    }
    
}
