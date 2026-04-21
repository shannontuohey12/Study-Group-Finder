public abstract class User {
    private String name;
    private int userID;
    private String password;
    private String role;
    
    public User(String name, int userID, String password, String role) {
        this.name = name;
        this.userID = userID;
        this.password = password;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public int getUserID() {
        return userID;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
