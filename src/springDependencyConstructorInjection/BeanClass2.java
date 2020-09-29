package springDependencyConstructorInjection;

/**
 * Created by asus on 6/16/2020.
 */
public class BeanClass2 implements IBeanClass {

    public BeanClass2() {
        System.out.println( " BeanClass2 create ");
    }

    public BeanClass2(String pass) {
        System.out.println( " BeanClass2 with String paramater");
        System.out.println(" pass is= " + pass);
    }


    @Override
    public void print() {
        System.out.println(" BeanClass2 print ");
    }
}
