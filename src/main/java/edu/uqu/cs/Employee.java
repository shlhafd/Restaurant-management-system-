package edu.uqu.cs;

public class Employee {
    private String name;
    private int id;
    private String salary;
    
    public Employee(String name, int id, String salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    
    public String getName() {
        return name;
    }
    
    public int getId() {
        return id;
    }
    
    public String geSalary() {
        return salary;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id + ", Salary : $ " + salary ;
    }
}