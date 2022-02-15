package first;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.travel.Bike;
import com.travel.Car;

public class MainLogic {
	
	public static void main(String args[]) {
		
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
		Car cr = (Car) ac.getBean("kia");
		cr.move();
		Bike b = (Bike) ac.getBean("ktm");
		b.move();
		
		//System.out.println(st.getSid()+" "+st.getSname()+" "+st.getSmarks());
	}
}
