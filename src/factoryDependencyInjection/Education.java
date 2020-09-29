package factoryDependencyInjection;

/**
 * Created by asus on 6/17/2020.
 */
public class Education implements IPersonDetail{
    String educationLevel;
    String educationName;
    private IAdressGernaral address;

    public Education(String educationName, String educationLevel, IAdressGernaral address) {
        this.educationName = educationName;
        this.address = address;
        this.educationLevel = educationLevel;
    }

    public void show(){
        System.out.println(" Education Status : "+ educationLevel+" "+educationName);
        System.out.println(address.showAdress());
    }
}
