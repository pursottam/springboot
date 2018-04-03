import com.core.repository.CustomerRepository;
import com.core.repository.HibernateCustomerRepositoryImpl;
import com.core.service.CustomerService;
import com.core.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"com.core"})
@PropertySource("app.properties")
public class AppConfig {

//    @Bean(name="customerService")
////    public CustomerService getCustomerService(){
////        CustomerService customerService = new CustomerServiceImpl();
////        customerService.setCustomerRepository(getCustomerRepository());
////        return customerService;
////    }
////
////    @Bean(name="customerRepository")
////    public CustomerRepository getCustomerRepository(){
////        return new HibernateCustomerRepositoryImpl();
////    }

}
