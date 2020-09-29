package factoryDependencyInjection;

/**
 * Created by asus on 6/17/2020.
 */
public class FactorySinglton {

    private FactorySinglton(){}

    private static Employee instanceEmployee;
    private static Employee2 instanceEmployee2;
    private static Job instanceJob;
    private static Education instanceEducation;
    private static TypeOfMarage instanceTypeOfMarage;
    private static Address instanceAddress;


    private static Employee getInstanceEmployee( String type ) {
        if((instanceEmployee==null) || !(type.equalsIgnoreCase("singlton")))
            instanceEmployee= new Employee(10,"meysam");
         return instanceEmployee;

        }

    private static Employee2 getInstanceEmployee2(String type) {
        if((instanceEmployee2.equals(null)) || !(type.equalsIgnoreCase("singlton")))
             instanceEmployee2 = new Employee2(10,"meysam");

            return  instanceEmployee2;
    }

    private static Job getInstanceJob(String type) {
        if((instanceJob.equals(null)) || !(type.equalsIgnoreCase("singlton")))
             instanceJob =new Job("doctor",5,new Address("tehran","tehran","Iran"));

            return instanceJob;

    }

    private static Education getInstanceEducation(String type) {
        if((instanceEducation.equals(null)) || !(type.equalsIgnoreCase("singlton")))
             instanceEducation =new Education("doctor","master",new Address("tehran","tehran","Iran"));

            return instanceEducation ;

    }

    private static TypeOfMarage getInstanceTypeOfMarage(String type) {
        if((instanceTypeOfMarage.equals(null)) || !(type.equalsIgnoreCase("singlton")))
            return instanceTypeOfMarage = new TypeOfMarage("single",0);

            return instanceTypeOfMarage;


    }

    private static Address getInstanceAddress(String type) {
        if((instanceAddress.equals(null)) || !(type.equalsIgnoreCase("singlton")))
            return instanceAddress = new Address("tehran","tehran","Iran");

            return instanceAddress;

    }

    public static Object getObject(String className , String type)
    {

        if (className.equalsIgnoreCase("person"))
        {
            return getInstanceEmployee(type);
        }
        if (className.equalsIgnoreCase("person2"))
        {
            return getInstanceEmployee2(type);
        }
        else if (className.equalsIgnoreCase("job"))
        {
             return getInstanceJob(type);
        }
        else if (className.equalsIgnoreCase("education"))
        {
            return getInstanceEducation(type);
        }
        else if (className.equalsIgnoreCase("mary"))
        {
            return getInstanceTypeOfMarage(type);
        }
        else if (className.equalsIgnoreCase("adress"))
        {
            return getInstanceAddress(type);
        }
        else
            return null;
    }




}
