import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Appmain {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		 Employee e = (Employee)ac.getBean("emp");
		 System.out.println(e.toString());

	}

}
