package classicDependencyInjection;

/**
 * Created by asus on 6/17/2020.
 */
public class Employee {
    private int id;
    private String name;


      // Dependency Injection with Setter Method and use polyMorphism and Interface
  private IAdressGernaral address;

    public IAdressGernaral getAddress() {
        return address;
    }

    public void setAddress(IAdressGernaral address) {
        this.address = address;
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void show(){
        System.out.println(id+" "+name);
        System.out.println(address.showAdress());
    }


  /*  // Dependency Injection with Setter Method
  private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void show(){
        System.out.println(id+" "+name);
        System.out.println(address.showAdress());
    }*/

 /*
   // dependency between two class

   private Address address = new Address(" tehran "," tehran "," iran ");
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;

    }*/

 /*
   // Dependency Injection with Constructor
   private Address address;

    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }*/
}
