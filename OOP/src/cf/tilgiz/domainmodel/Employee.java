package cf.tilgiz.domainmodel;

public class Employee {

    private static int id;
    private int employeeId;
    private String name;
    private String position;
    private int salary;
    private String department;

    static {

        System.out.println("Static initialization block is called.");
    }
    {
        System.out.println("Non-static initialization block is called.");
    }

    public Employee() {
        this("Name","Position",200);
        System.out.println("Empty constructor is called");
    }

    public Employee(String name, String position, int salary) {
        this(name,position,salary,"IT");
        System.out.println("Constructor with 3 params is called");
    }

    private Employee(String name, String position, int salary, String department) {
        employeeId = id++;
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.department = department;
        System.out.println("Constructor with 4 params is called");
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public static int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
