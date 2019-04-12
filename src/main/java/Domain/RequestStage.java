package Domain;

import Enums.RequestStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequestStage {
    private Long id;
    private String description;
    private Date realizationDate;
    private RequestStatus state;
    private Request request;
    private User user;
}
