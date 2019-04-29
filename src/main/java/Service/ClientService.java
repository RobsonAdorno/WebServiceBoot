package Service;

import Domain.Client;
import Repository.ClientRepository;
import Service.ServiceUtils.HashUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientService {


    @Autowired public ClientRepository clientRepository;

    public Client loginClient(String login, String senha){
        senha = HashUtils.toHash(senha);

        Optional<Client> clientOptional = clientRepository.clientLogin(login, senha);
        return clientOptional.get();
    }
}
