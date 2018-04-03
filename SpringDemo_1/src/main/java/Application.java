import com.core.model.Customer;
import com.core.service.CustomerService;
import com.core.service.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Application {
    public static void main(String args[]){
       // CustomerService customerService= new CustomerServiceImpl();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        CustomerService customerService=applicationContext.getBean("customerService",CustomerService.class);
        List<Customer> customerList=customerService.findAll();
        System.out.println("Customer Size()-->"+customerList.size());

    }
}
