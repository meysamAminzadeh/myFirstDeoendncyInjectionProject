package classicDependencyInjection;

/**
 * Created by asus on 6/17/2020.
 */
public class Employee2 implements IAdress {

    private Address address;
    private int id;
    private String name;

    @Override
    public void DIWithInterfaceAdress(Address address) {
        this.address=address;
    }

    public Employee2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void show(){
        System.out.println(id+" "+name);
        System.out.println(address.showAdress());
    }


}
