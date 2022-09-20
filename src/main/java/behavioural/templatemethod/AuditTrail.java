package behavioural.templatemethod;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class AuditTrail {

    public void record() {
        System.out.println("Audit");
    }
}
