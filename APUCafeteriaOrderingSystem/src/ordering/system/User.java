package ordering.system;
public class User {
    
    private String username;
    private String useremail;
    private String usercontact;
    private String usergender;
    private String userage;
    private String userpassword;
    private String useraddress;

    public User(String name, String email, String contact, String gender, String age, String password, String address) {
        this.username = name;
        this.useremail = email;
        this.usercontact = contact;
        this.usergender = gender;
        this.userage = age;
        this.userpassword = password;
        this.useraddress = address;
    }

    public String getName() {
        return username;
    }
    public String getEmail() {
        return useremail;
    }
    public String getContact() {
        return usercontact;
    }
    public String getGender() {
        return usergender;
    }
    public String getAge() {
        return userage;
    }
    public String getPassword() {
        return userpassword;
    }
    public String getAddress() {
        return useraddress;
    }
}
