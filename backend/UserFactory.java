public class UserFactory {
    public User createUser(String name, int userID, String password, String role, String major) {
        if (role.equals("Student")) {
            return new Student(name, userID, role, major);
        } else if (role.equals("IT Staff")) {
            return new ITStaff(name, userID, role);
        } else {
            throw new IllegalArgumentException("Invalid role: ");
        }
    }
}
