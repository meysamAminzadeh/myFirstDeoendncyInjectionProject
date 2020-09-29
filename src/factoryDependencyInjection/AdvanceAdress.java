package factoryDependencyInjection;

/**
 * Created by asus on 6/17/2020.
 */
public class AdvanceAdress implements IAdressGernaral {
    private String city;
    private String state;
    private String country;
    private long zipCode;

    public AdvanceAdress(String city, String state, String country, long zipCode) {
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipCode=zipCode;
    }
    @Override
    public String showAdress(){
        return city+" "+state+" "+country +" "+zipCode;
    }
}
