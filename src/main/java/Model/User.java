package Model;
//    without setters, @ModelAttribute won't populate your fields.

public class User {
    private String email;
    private String password;

    // ✅ Required public no-argument constructor
    public User() {
    }

    // Optional: parameterized constructor
    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    // ✅ Setters
    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // ✅ Getters
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

//what-ever the fields name in the form - should be here as it is