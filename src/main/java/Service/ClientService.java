package Service;

import Domain.Client;
import Repository.ClientRepository;
import Service.ServiceUtils.HashUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService{
    @Autowired private ClientRepository clientRepository;

    public List<Client> returnAllClients(){
        return clientRepository.returnAllClients();
    }

    public Client returnClientById(Long id){
        Optional<Client> client = clientRepository.returnClientById(id);
        return client.get();
    }

    public Client loginClient(String login, String senha){
        senha = HashUtils.toHash(senha);

        Optional<Client> clientOptional = clientRepository.clientLogin(login, senha);
        return clientOptional.get();
    }
}
