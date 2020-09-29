package prototypeInSinglton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by asus on 6/15/2020.
 */
public class MainClass {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("conf/application_context.xml");

        Singlton singlton = context.getBean("sing",Singlton.class);

        Prototype prototype = singlton.getPrototype();
        Prototype prototype1 = singlton.getPrototype();

        if(prototype==prototype1){
            System.out.println(" object prototype is singlton");
        }
        else{
            System.out.println(" object prototype is not singlton");
        }

    }


}
