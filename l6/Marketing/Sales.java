package l6.Marketing;

import l6.General.Employee;

public class Sales extends Employee {
    public Sales(int empid, String ename) {
        super(empid, ename);
    }

    public double tAllowance(double basic) {
        double totalEarnings = earnings(basic);
        return 0.05 * totalEarnings;
    }
}
