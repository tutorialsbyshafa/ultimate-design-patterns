package behavioural.command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AddCustomerCommand implements Command {
    private CustomerService customerService;

    @Override
    public void execute() {
        customerService.addCustomer();
    }
}
