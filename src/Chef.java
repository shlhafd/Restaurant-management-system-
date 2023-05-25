package edu.uqu.cs;

 public class Chef extends Employee implements Salary{
  private int OverTime;
 private int experience; 

    public Chef(int OverTime, int experience, String id, String name, String date, double salary) {
        super(id, name, date, salary);
        this.OverTime = OverTime;
        this.experience = experience;
    }

   
    public int getOverTime() {
        return OverTime;
    }

    public void setOverTime(int OverTime) {
        this.OverTime = OverTime;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
 public double calculationSalary()
    {
         double x=getSalary()/132.0;
       return getSalary()+experience*((1.5/100)*getSalary())+(OverTime*(x*1.5));
    }
 
}
