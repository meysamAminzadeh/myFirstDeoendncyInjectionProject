package factoryDependencyInjection;

/**
 * Created by asus on 6/17/2020.
 */
public class Employee implements IPersonDetail{
    private int id;
    private String name;

     // Dependency Injection with Setter Method
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

    public void show(){
        System.out.println(id+" "+name);
        System.out.println(address.showAdress());
    }

         /* // Dependency Injection with Setter Method and use polyMorphism and Interface
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
*/

    /*  // Dependency Injection with Constructor
   private IAdressGernaral address;

    public Employee(int id, String name, IAdressGernaral address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

  public void show(){
        System.out.println(id+" "+name);
        System.out.println(address.showAdress());
    }
*/


}
