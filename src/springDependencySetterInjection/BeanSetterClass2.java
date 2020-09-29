package springDependencySetterInjection;

/**
 * Created by asus on 6/16/2020.
 */
public class BeanSetterClass2 implements IBeanSetterClass {

   private IBeanSetterClass iBeanSetterClass;

    public void setiBeanSetterClass(IBeanSetterClass iBeanSetterClass) {
        this.iBeanSetterClass = iBeanSetterClass;
    }

    private BeanSetterClass1 beanSetterClass1;

    public void setBeanSetterClass1(BeanSetterClass1 beanSetterClass1) {
        this.beanSetterClass1 = beanSetterClass1;
    }



    public IBeanSetterClass getiBeanSetterClass() {
        return iBeanSetterClass;
    }



    public BeanSetterClass1 getBeanSetterClass1() {
        return beanSetterClass1;
    }


    public BeanSetterClass2() {
        System.out.println( " BeanSetterClass2 create ");
    }


    public BeanSetterClass2( BeanSetterClass1 beanSetterClass1) {
        System.out.println( " BeanSetterClass2 create  with constructor class1 parameter");
        this.beanSetterClass1 = beanSetterClass1;
    }
    @Override
    public void print() {
        System.out.println(" BeanSetterClass2 print ");
    }
}
