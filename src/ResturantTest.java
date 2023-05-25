package edu.uqu.cs;

import java.util.Scanner;

/**
 *
 * @author shlha
 */
public class ResturantTest {
 
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        Department dep1=new Department("al azizia");
        Supervisor s1=new Supervisor(5,"123", "saud", "1/8/2017", 18500);
        Supervisor s2=new Supervisor(6,"456", "bader", "13/7/2016", 13400);
       
        dep1.addupper(s1);
        dep1.addupper(s2);
       
        Chef c1=new Chef(5,15,"fg","eg","rrgr",3900);
        dep1.addChef(c1);
        
        Waiter n1=new Waiter(15,"e1", "mohammad", "18/7/2019", 3900);
        dep1.addWaiter(n1);
      
        
        
        
        Department dep2=new Department("al awalee");
         Supervisor s3=new Supervisor("789", "ahmad", "super3", "19/6/2011", 16200);
        Supervisor s4=new Supervisor("963", "saleh", "super4", "21/5/2007", 21000);
        
        
        
        Chef c2=new Chef(10,20,"fg","eg","rrgr",4000);
        dep1.addChef(c2);
        
        Waiter n2=new Waiter(12,"e1", "mohammad", "18/7/2019", 2000);
        dep1.addWaiter(n2);
        
        
        
        
        
        
        
        int exit=1;
        while(exit==1){
        System.out.println("enter your name ");
        String name=k.next();
        boolean ex=false;
        for (int i = 0; i < s.supperList.size(); i++) {
            if(name.equals(s.supperList.get(i).getName()))
            {
                
                System.out.println(s.supperList.get(i).calculationSalary());
                ex=true;
            }
        }
            if(ex==false)
            {
              for (int i = 0; i < s.normal.size(); i++) {
            if(name.equals(s.normal.get(i).getName()))
            {
                System.out.println(s.normal.get(i).calculationSalary());
                ex=true;
            } 
              }
            if(ex==false) 
                System.out.println("name not found");
            
            }
            System.out.println("enter 1 to continue or press any key to exit ");
            exit=k.nextInt();
        }
    }
    
}
   
