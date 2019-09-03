package cf.tilgiz.constructors;

import cf.tilgiz.domainmodel.Employee;

public class ContructorsMain {

    public static void main(String[] args) {

        Employee employee = new Employee("ilgiz","developer", 100);
        System.out.println(employee);
        System.out.println(employee.toString());

        System.out.println("-----------------------------------------------------");

        Employee employee1 = new Employee("zigli","developer", 100);
        System.out.println(employee1);
        System.out.println(employee1.toString());

        System.out.println("-----------------------------------------------------");

        Employee employeeEmpty = new Employee();

    }
}
