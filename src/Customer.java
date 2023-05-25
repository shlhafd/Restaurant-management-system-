public class Customer {
    private String name;
    private int id;
    private String phone;
    
    public Customer(String name, int id, String phone) {
        this.name = name;
        this.id = id;
        this.phone = phone;
    }
    
    public String getName() {
        return name;
    }
    
    public int getId() {
        return id;
    }
    
    public String getPhone() {
        return phone;
    }
    
    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id + ", Phone: " + phone;
    }
}
