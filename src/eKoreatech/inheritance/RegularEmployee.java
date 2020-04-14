package eKoreatech.inheritance;

public final class RegularEmployee extends Employee {  // final 클래스에 있는 메소드들은 오버라이딩 대상이 되지 못한다.

    private int transportationAllowance;

    public RegularEmployee(String name, long salary, int ta) {
        super(name, salary);
        this.transportationAllowance = ta;
    }

    @Override
    public long paySalary() {
        return this.salary / 12 + this.transportationAllowance;
    }

    public int getTransportationAllowance() {
        return transportationAllowance;
    }

    @Override
    public String toString() {
        return super.toString() +
                "RegularEmployee{" +
                "transportationAllowance=" + transportationAllowance +
                '}';
    }
}
