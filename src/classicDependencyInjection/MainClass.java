package classicDependencyInjection;

/**
 * Created by asus on 6/15/2020.
 */
public class MainClass {
    public static void main(String[] args) {

            Employee employee = new Employee(10," meysam ");
        IAdressGernaral iAdressGernaral= new Address (" tehran "," tehran "," iran ");
        employee.setAddress(iAdressGernaral);
        employee.show();
         iAdressGernaral= new AdvanceAdress (" tehran "," tehran "," iran ",1213145L );
        employee.setAddress(iAdressGernaral);
        employee.show();




        /*   Employee employee = new Employee(10," meysam ", new Address (" tehran "," tehran "," iran "));
        employee.show();
*/
     /*   Employee employee = new Employee(10," meysam ");
        employee.setAddress(new Address (" tehran "," tehran "," iran "));
        employee.show();*/

       /* Employee2 employee2 = new Employee2(10," meysam ");
        employee2.DIWithInterfaceAdress(new Address (" tehran "," tehran "," iran "));
        employee2.show();*/

    }
}
