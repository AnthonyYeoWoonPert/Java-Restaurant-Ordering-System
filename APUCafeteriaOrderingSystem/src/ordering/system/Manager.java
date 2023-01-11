package ordering.system;
public class Manager extends User {
    private String ManagerID;
    private String Role;

    public String getManagerID() {
        return ManagerID;
    }
    public String getManagerRole() {
        return Role;
    }
    
    public Manager(String name, String email, String contact, String gender, String age, String password, String address) {
        super(name, email, contact, gender, age, password, address);
        this.ManagerID = "M";
        this.Role = "Manager";
    }  
}
