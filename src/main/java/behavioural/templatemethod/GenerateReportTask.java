package behavioural.templatemethod;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GenerateReportTask extends Task{
    private AuditTrail auditTrail;

    @Override
    protected void doExecute() {
        System.out.println("Generate report");
    }
}
