package edu.uqu.cs;

public class Employee {
    private String id;
    private String name;
    private String date;
    private double salary;

    public Employee(String id, String name, String date, double salary) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
