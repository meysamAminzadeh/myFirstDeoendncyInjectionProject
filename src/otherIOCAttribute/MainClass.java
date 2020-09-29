package otherIOCAttribute;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import otherIOCAttribute.myBeans.Bean1;
import otherIOCAttribute.myBeans.Bean2;
import otherIOCAttribute.myBeans.IBean;

/**
 * Created by asus on 6/16/2020.
 */
public class MainClass {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("conf/application_context.xml");

      /*  IBean iBean= context.getBean(Bean1.class);
         iBean.print();
        Bean1 bean1= context.getBean(Bean1.class);
        bean1.print();
        Bean2 bean2= context.getBean(Bean2.class);
        bean2.print();
*/


      /*
        Bean1 obj1bean1 =context.getBean("b1",Bean1.class);
        Bean1 obj2bean1 = context.getBean("b1",Bean1.class);

        System.out.println(obj1bean1==obj2bean1);

        Bean2 obj1bean2 =context.getBean("b2",Bean2.class);
        Bean2 obj2bean2 = context.getBean("b2",Bean2.class);

        System.out.println(obj1bean2==obj2bean2);

        */

/*        Bean1 obj1bean1 =context.getBean(Bean1.class);*/

    /*    Bean1 bean1 =context.getBean("b1",Bean1.class);
        Bean1 bean2 = context.getBean("b2",Bean1.class);
        System.out.println(bean1==bean2);
*/

      /*  Bean1 bean3= context.getBean("b1/",Bean1.class);
        bean3.print();
*/
    }



}
