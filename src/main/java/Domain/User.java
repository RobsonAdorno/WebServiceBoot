package Domain;

import Enums.RequestStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private int ID;
    private String name;
    private String CPF;
    private String login;
    private String senha;
    private RequestStatus role;
    private List<Request> requests = new ArrayList<Request>();
    private List<RequestStage> userStage = new ArrayList<RequestStage>();

}
