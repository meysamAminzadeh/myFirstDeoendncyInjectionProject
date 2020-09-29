package factoryDesignPattern.DAO;

public class MainClass
{
    public static void main(String[] args)
    {
        DAOFactory factory = new DAOFactory();
        DAO classObject = factory.getObject("person");
        classObject.insert();
    }
}
