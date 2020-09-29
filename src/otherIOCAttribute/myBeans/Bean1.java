package otherIOCAttribute.myBeans;

/**
 * Created by asus on 6/16/2020.
 */
public class Bean1 implements IBean {
    public Bean1() {
        System.out.println( " Bean1 create ");
    }

    @Override
    public void print() {
        System.out.println(" print bean1 ");
    }
}
