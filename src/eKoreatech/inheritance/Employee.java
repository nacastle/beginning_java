package eKoreatech.inheritance;

public abstract class Employee implements Payable {

    private String name;
    protected long salary;

    public Employee(String name, long salary) {
        this.name = name;
        this.salary = salary;
    }



    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }

    @Override  // Object 클래스에 있는 toString 메소드가 Overriding 된것
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
