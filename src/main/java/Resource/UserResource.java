package Resource;

import DTO.ClientLoginDTO;
import Domain.Client;
import Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@SpringBootApplication
@RestController
@RequestMapping(value = "client")
public class UserResource {

    @Autowired private ClientService clientService;

    @RequestMapping("/login")
    private ResponseEntity<Client> login(@RequestBody ClientLoginDTO client){

        Client logged = clientService.loginClient(client.getLogin(), client.getPassword());
        return ResponseEntity.ok(logged);
    }

    public static void main (String[] args){

        SpringApplication.run(UserResource.class, args);

    }
}
