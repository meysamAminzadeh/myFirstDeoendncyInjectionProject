package factoryDependencyInjection;

/**
 * Created by asus on 6/17/2020.
 */
public class Factory {

/*
 // for constructor dependency Injection
  public static IPersonDetail getObject(String className)
    {

        if (className.equalsIgnoreCase("person"))
        {
            return new Employee(10,"meysam",new Address("tehran","tehran","Iran"));
           // return new Employee(10,"meysam",new AdvanceAdress("tehran","tehran","Iran",54345L));
        }
        else if (className.equalsIgnoreCase("job"))
        {
            return new Job("doctor",5,new Address("tehran","tehran","Iran"));
        }
        else if (className.equalsIgnoreCase("education"))
        {
            return new Education("doctor","master",new Address("tehran","tehran","Iran"));
        }
        else if (className.equalsIgnoreCase("mary"))
        {
            return new TypeOfMarage("single",0);
        }
        else
            return null;
    }*/


    // for setter and interface DI
    public static Object getObject(String className)
    {

        if (className.equalsIgnoreCase("person"))
        {
            return new Employee(10,"meysam");
        }
        if (className.equalsIgnoreCase("person2"))
        {
            return new Employee2(10,"meysam");
        }
        else if (className.equalsIgnoreCase("job"))
        {
            return new Job("doctor",5,new Address("tehran","tehran","Iran"));
        }
        else if (className.equalsIgnoreCase("education"))
        {
            return new Education("doctor","master",new Address("tehran","tehran","Iran"));
        }
        else if (className.equalsIgnoreCase("mary"))
        {
            return new TypeOfMarage("single",0);
        }
        else if (className.equalsIgnoreCase("adress"))
        {
            return new Address("tehran","tehran","Iran");
        }
        else
            return null;
    }




}
