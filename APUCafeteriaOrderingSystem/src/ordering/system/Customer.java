package ordering.system;
public class Customer extends User{
    
    private String CustomerID;
    private String Role;
    
    public String getCustomerID() {
        return CustomerID;
    }
    public String getCustomerRole() {
        return Role;
    }

    public Customer(String name, String email, String contact, String gender, String age, String password, String address) {
        super(name, email, contact, gender, age, password, address);
        this.CustomerID = "C";
        this.Role = "Customer";
    }  
}
