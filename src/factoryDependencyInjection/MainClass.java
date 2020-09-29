package factoryDependencyInjection;

/**
 * Created by asus on 6/15/2020.
 */
public class MainClass {
    public static void main(String[] args) {


        Employee employee1 = (Employee) FactorySinglton.getObject("person","prototype");
        Employee employee2 = (Employee) FactorySinglton.getObject("person","prototype");

        if(employee1== employee2){
            System.out.println(" you succeed to make your singlton object ");
        }
        else{
            System.out.println(" you do not succeed to make your singlton object ");
        }


      /*  // Interface dependency injection
        Employee2 employee2= (Employee2) Factory.getObject("person2");
        employee2.DIWithInterfaceAdress((Address) Factory.getObject("adress"));
        employee2.show();
        IPersonDetail iPersonDetail= (IPersonDetail) Factory.getObject("job");
        iPersonDetail.show();
*/



      /*
        // customer dependency injection
        IPersonDetail iPersonDetail=  Factory.getObject("person");
        iPersonDetail.show();
        iPersonDetail= Factory.getObject("job");
        iPersonDetail.show();
*/

       /*
       // setter method dependency injection
        Employee employee= (Employee) Factory.getObject("person");
        employee.setAddress((Address) Factory.getObject("adress"));
        employee.show();
        IPersonDetail iPersonDetail= (IPersonDetail) Factory.getObject("job");
        iPersonDetail.show();*/


    }
}
