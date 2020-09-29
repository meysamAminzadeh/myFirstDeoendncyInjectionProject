package springDependencyConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by asus on 6/16/2020.
 */
public class MainClass {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("conf/application_context.xml");
       /*
        IBeanClass iBeanClass = context.getBean("b1",BeanClass1.class);
        iBeanClass.print();

        context.getBean("b2",BeanClass1.class).print();

       */
        context.getBean("b1",BeanClass1.class).beanClass2.print();
        context.getBean("b1",BeanClass1.class).iBeanClass.print();


    }


}
