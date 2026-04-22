public class Client {
    void orderUser(String name, int userID, String password, String role, String major, int year) {
        UserFactory userFactory = new UserFactory();
        User user = userFactory.createUser(name, userID, password, role, major);
        user.displayInfo();
    }
}
