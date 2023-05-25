package edu.uqu.cs;

public class Waiter  extends Employee implements Salary {
    private int OverTime;

    public Waiter(int OverTime, String id, String name, String date, double salary) {
        super(id, name, date, salary);
        this.OverTime = OverTime;
    }

 public double calculationSalary()
 {
     double x=getSalary()/132.0;
    return getSalary()+(OverTime*(x*1.5)); 
 }
    
}
