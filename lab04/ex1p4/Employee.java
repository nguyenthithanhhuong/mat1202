package lab04.ex1p4;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return String.format("%s %s", firstName, lastName);
    }

    public int getAnnualSalary() {
        return 12 * salary;
    }

    public int raiseSalary(int percent) {
        salary = (int)(salary + salary * percent / 100);
        return salary;
    }

    public String toString() {
        return String.format("Employee[id = %d, name = %s, salary = %d]",
                id, getName(), salary);
    }
}
