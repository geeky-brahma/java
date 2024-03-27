package l6.General;

public class Employee {
    protected int empid;
    private String ename;

    public Employee(int empid, String ename) {
        this.empid = empid;
        this.ename = ename;
    }

    public double earnings(double basic) {
        double DA = 0.8 * basic;
        double HRA = 0.15 * basic;
        return basic + DA + HRA;
    }
}
