package behavioural.chainofresponsibility;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class HttpRequest {
    private String username;
    private String password;
}
