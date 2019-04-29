package Repository;

import Domain.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<ClientRepository, Integer> {

    @Query("SELECT FROM Client WHERE login =?1 AND senha = ?2")
    public Optional<Client> clientLogin(String login, String senha);
}
