package edu.uqu.cs;

public class Supervisor extends Employee implements Salary {
    private int experience;

    public Supervisor(int experience, String id, String name, String date, double salary) {
        super(id, name, date, salary);
        this.experience = experience;
    }

  
   

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
    public double calculationSalary()
    {
       return getSalary()+experience*((2.0/100)*getSalary());
    }
    
}
    

