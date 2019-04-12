package Domain;

import Enums.RequestStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Request {
    private Long id;
    private String subject;
    private String description;
    private Date creationDate;
    private RequestStatus state;
    private User user;
    private List<RequestStage> stages = new ArrayList<RequestStage>();
}
