package Repository;

import Domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.List;
import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<ClientRepository, Integer> {

    @Query("SELECT FROM Client WHERE login =?1 AND senha = ?2")
    public Optional<Client> clientLogin(String login, String senha);

    @Query("SELECT FROM Client WHERE id =?1")
    public Optional<Client> returnClientById(Long id);

    @Query("SELECT FROM Client")
    List<Client> returnAllClients();
}
