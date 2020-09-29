package springDependencySetterInjection;

/**
 * Created by asus on 6/16/2020.
 */
public class BeanSetterClass1 implements IBeanSetterClass {

    public BeanSetterClass1() {
        System.out.println(" BeanSetterClass1 create ");
    }
    public BeanSetterClass1(int id) {
        System.out.println(" BeanSetterClass1 created with id parameter onstructor ");
        this.id = id;
    }

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    private int id;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }





    @Override
    public void print() {
        System.out.println(" BeanSetterClass1 print ");
    }
}
