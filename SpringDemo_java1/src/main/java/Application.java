import com.core.model.Customer;
import com.core.service.CustomerService;
import com.core.service.CustomerServiceImpl;

import java.util.List;

public class Application {
    public static void main(String args[]){
        CustomerService customerService= new CustomerServiceImpl();
        List<Customer> customerList=customerService.findAll();
        System.out.println("Customer Size()-->"+customerList.size());

    }
}
