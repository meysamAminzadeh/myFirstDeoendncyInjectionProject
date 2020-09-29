package springStartConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by asus on 6/15/2020.
 */
public class MainClass {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("conf/application_context.xml");

         IClass obj = context.getBean("c1",IClass.class);
        obj.print();

         ((ClassPathXmlApplicationContext) (context)).close();
         ((ClassPathXmlApplicationContext) (context)).refresh();

        Class2 c2 =context.getBean("c2",Class2.class);
        c2.chap();




           /* IClass obj = (IClass) context.getBean("c1");
        obj.print();
*/


    }


}
