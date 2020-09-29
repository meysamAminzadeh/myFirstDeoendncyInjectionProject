package factoryDependencyInjection;

/**
 * Created by asus on 6/17/2020.
 */
public class TypeOfMarage implements IPersonDetail{

    int duringTime;
    String typeMarage;

    public TypeOfMarage(String typeMarage, int duringTime) {
        this.typeMarage = typeMarage;
        this.duringTime = duringTime;
    }

    public void show() {
        System.out.println(" Type Of Mary "+duringTime + " " + typeMarage);

    }
}
