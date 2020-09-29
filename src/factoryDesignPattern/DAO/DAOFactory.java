package factoryDesignPattern.DAO;

public class DAOFactory
{
    public DAO getObject(String className)
    {

       if (className.equalsIgnoreCase("person"))
        {
            return new PersonDAO();
        }
        else if (className.equalsIgnoreCase("users"))
        {
            return new UsersDAO();
        }
        else if (className.equalsIgnoreCase("book"))
        {
            return new BookDAO();
        }
        else
            return null;
    }
}
