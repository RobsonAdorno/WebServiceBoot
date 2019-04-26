package Domain;

import Enums.RequestStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 75, nullable = false)
    private String name;

    @Column(length = 11, nullable = false, unique = true)
    private String cpf;

    @Column(length = 75, nullable = false, unique = true)
    private String login;

    @Column(length = 100, nullable = false)
    private String senha;

    @Column(length = 20, nullable = false)
    @Enumerated(EnumType.STRING)
    private RequestStatus role;

    @OneToMany(targetEntity = Request.class, fetch=FetchType.EAGER)
    @JoinColumn(name="request_id")
    private List<Request> requests = new ArrayList<Request>();

    @OneToMany(targetEntity = RequestStage.class, fetch=FetchType.EAGER)
    @JoinColumn(name="request_id")
    private List<RequestStage> userStage = new ArrayList<RequestStage>();

}
