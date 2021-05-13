package constructormode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import constructormode.Employee;
import constructormode.Department;
public class EmployeeMain {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("constructor.xml");
		 Employee e = (Employee)ac.getBean("emp1");
		 System.out.println(e.toString());
	}

}
