package classicDependencyInjection;

/**
 * Created by asus on 6/17/2020.
 */
public class Address implements IAdressGernaral {

    private String city;
    private String state;
    private String country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }
   @Override
    public String showAdress(){
        return city+" "+state+" "+country;
    }
}
