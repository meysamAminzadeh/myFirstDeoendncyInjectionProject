package springDependencyConstructorInjection;

/**
 * Created by asus on 6/16/2020.
 */
public class BeanClass1 implements IBeanClass {

    public BeanClass1() {
        System.out.println(" BeanClass1 create ");
    }

    public BeanClass1(String id) {
        System.out.println(" Constructor with paramater String id");
        System.out.println(" string id is = " + id);
    }

   public BeanClass1(int id) {
        System.out.println(" Constructor with paramater int id");
        System.out.println(" int id is = " + id);
    }


    public BeanClass1(String name , String family) {
        System.out.println(" Constructor with 2 paramater String ");
        System.out.println(" name is = " + name +" " + " family is = "+family);
    }

    BeanClass2 beanClass2;
    IBeanClass iBeanClass;
    public BeanClass1(BeanClass2 beanClass2) {
        System.out.println( " Class2's object inject into Class1 in Cunstructor  " );
        this.beanClass2=beanClass2;
        this.iBeanClass=beanClass2;
    }


    @Override
    public void print() {
        System.out.println(" BeanClass1 print ");
    }
}
