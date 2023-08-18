import com.itheima.reggie.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.lang.model.element.VariableElement;

public class Test {

    @org.junit.jupiter.api.Test
    public void test1(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigTest.class);
        Employee bean = context.getBean(Employee.class);
        System.out.println(bean);
    }

}
