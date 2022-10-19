
package databaseLayer;

import pojo.domain.Client;

public interface IClienteDAO {
    
    public Boolean cadastrar(Client cliente);
    
    public void excluir(Long cpf);
    
    public void alterar(Client cliente);
    
    public Client consultar(Long cpf);
}
