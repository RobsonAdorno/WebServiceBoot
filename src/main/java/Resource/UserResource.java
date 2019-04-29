package Resource;

import DTO.ClientDTO;
import DTO.ClientLoginDTO;
import Domain.Client;
import Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
@EntityScan("Domain")
@EnableJpaRepositories("ClientRepository")
@RequestMapping(value = "client")
public class UserResource {

    @Autowired private ClientService clientService;

    @GetMapping
    private ResponseEntity<List<Client>> returnAllClients(){
        List<Client> clientList = clientService.returnAllClients();
        return ResponseEntity.ok(clientList);
    }

    @GetMapping("{/id}")
    private ResponseEntity<Client> userById(@RequestBody ClientDTO client){
        Client clientById = clientService.returnClientById(client.getId());
        return ResponseEntity.ok(clientById);
    }

    @RequestMapping("/login")
    private ResponseEntity<Client> login(@RequestBody ClientLoginDTO client){

        Client logged = clientService.loginClient(client.getLogin(), client.getPassword());
        return ResponseEntity.ok(logged);
    }

    public static void main (String[] args){
        SpringApplication.run(UserResource.class, args);
    }
}
