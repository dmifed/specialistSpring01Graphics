package house;

import cities.CitiesHolder;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author dmifed
 */
public class HouseBuilder {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        House house = context.getBean(House.class);
        System.out.println(house);
    }
}
