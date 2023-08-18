import com.itheima.reggie.entity.Employee;
import org.springframework.context.annotation.Bean;



public class ConfigTest {

    @Bean
    public Employee create(){
        Employee employee = new Employee();
        return employee;
    }

}
