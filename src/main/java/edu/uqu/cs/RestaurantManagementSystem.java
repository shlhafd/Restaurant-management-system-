package edu.uqu.cs;

import java.util.ArrayList;

import java.util.Scanner;

public class RestaurantManagementSystem {
    private static ArrayList<Customer> customers = new ArrayList<>();
    private static ArrayList<Employee> employees = new ArrayList<>();
    private static ArrayList<Food> menu = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Adding some initial menu items
        menu.add(new Food("Burger", 5.99));
        menu.add(new Food("Pizza", 8.99));
        menu.add(new Food("Salad", 3.99));
        
        while (true) {
            System.out.println("Select an operation: ");
            System.out.println("1 - Add a customer");
            System.out.println("2 - Add an employee");
            System.out.println("3 - Display all customers");
            System.out.println("4 - Display all employees");
            System.out.println("5 - Add a food item to the menu");
            System.out.println("6 - Display menu");
            System.out.println("0 - Exit");
            
            int operation = scanner.nextInt();
            
            switch(operation) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    addCustomer(scanner);
                    break;
                case 2:
                    addEmployee(scanner);
                    break;
                case 3:
                    displayCustomers();
                    break;
                case 4:
                    displayEmployees();
                    break;
                case 5:
                    addFood(scanner);
                    break;
                case 6:
                    displayMenu();
                    break;
                default:
                    System.out.println("Invalid operation");
                    break;
            }
        }
    }
    
    private static void addCustomer(Scanner scanner) {
        System.out.println("Enter customer name: ");
        String name = scanner.next();
        System.out.println("Enter customer ID: ");
        int id = scanner.nextInt();
        System.out.println("Enter customer phone number: ");
        String phone = scanner.next();
        
        Customer customer = new Customer(name, id, phone);
        customers.add(customer);
        System.out.println("Customer added successfully");
    }
    
    private static void addEmployee(Scanner scanner) {
        System.out.println("Enter employee name: ");
        String name = scanner.next();
        System.out.println("Enter employee ID: ");
        int id = scanner.nextInt();
        System.out.println("Enter employee position: ");
        String position = scanner.next();
        
        Employee employee = new Employee(name, id);
        employees.add(employee);
        System.out.println("Employee added successfully");
    }
    
    private static void displayCustomers() {
        for (Customer c : customers) {
            System.out.println(c);
        }
    }
    
    private static void displayEmployees() {
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
    
   private static void addFood(Scanner scanner) {
        System.out.println("Enter food name: ");
        String name = scanner.next();
        System.out.println("Enter food price: ");
        double price = scanner.nextDouble();
        
        Food food = new Food(name, price);
        menu.add(food);
        System.out.println("Food item added successfully");
    }
    
    private static void displayMenu() {
        for (Food f : menu) {
            System.out.println(f);
        }
    }
}

