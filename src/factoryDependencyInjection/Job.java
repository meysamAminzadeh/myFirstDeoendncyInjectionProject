package factoryDependencyInjection;

/**
 * Created by asus on 6/17/2020.
 */
public class Job implements IPersonDetail{

    String name;
    int prorityTime;
    private IAdressGernaral address;

    public Job(String name, int prorityTime, IAdressGernaral address) {
        this.name = name;
        this.prorityTime = prorityTime;
        this.address = address;
    }
   public void show(){
        System.out.println(" Job Status : "+ prorityTime+" "+name);
        System.out.println(address.showAdress());
    }
}
