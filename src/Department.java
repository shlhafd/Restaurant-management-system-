package edu.uqu.cs;

import java.util.ArrayList;


public class Department {
    
   private String name;
   public ArrayList<Chef>chefList;
    public ArrayList<Waiter>waiterList;
   public ArrayList<Supervisor>supperList;

    public Department(String name) {
        this.name = name;
        chefList=new ArrayList<Chef>();
        supperList=new ArrayList<Supervisor>();
        waiterList=new ArrayList<Waiter>();
    }
    public void addChef(Chef n)
    {
        chefList.add(n);
    }
     public void addWaiter(Waiter n)
    {
        waiterList.add(n);
    }
    public void addupper(Supervisor s)
    {
        supperList.add(s);
    }
   
}   
