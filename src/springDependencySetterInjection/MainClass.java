package springDependencySetterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by asus on 6/16/2020.
 */
public class MainClass {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("conf/application_context.xml");


        //System.out.println(context.getBean("bc1",BeanSetterClass1.class).getName());

        //System.out.println(context.getBean("bc1",BeanSetterClass1.class).getId());

       /* BeanSetterClass1 beanSetterClass1= context.getBean("bc1",BeanSetterClass1.class);
        System.out.println(beanSetterClass1.getId());

        context.getBean("bc2",BeanSetterClass2.class).getiBeanSetterClass().print();
        System.out.println(context.getBean("bc3",BeanSetterClass2.class).getBeanSetterClass1().getId());
*/
        BeanSetterClass1 beanSetterClass1 = context.getBean("bc1",BeanSetterClass1.class);
        System.out.println(beanSetterClass1.getName() + " " + beanSetterClass1.getId());

        BeanSetterClass2 beanSetterClass2 = context.getBean("bc2",BeanSetterClass2.class);
        beanSetterClass2.getBeanSetterClass1().print();

        BeanSetterClass2 beanSetterClass2_1 = context.getBean("bc3",BeanSetterClass2.class);
        System.out.println(beanSetterClass2_1.getBeanSetterClass1().getName());



    }

}
