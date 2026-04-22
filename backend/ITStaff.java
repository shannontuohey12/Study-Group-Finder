class ITStaff extends User{

    private boolean accessControls;

    public ITStaff(String name, int userID, String password, String role) {
        super(name, userID, password, role);
    }

    public ITStaff(String name, int userID, String role){
        super(name, userID, null, role);
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("User ID: " + getUserID());
        System.out.println("Role: " + getRole());
        System.out.println("Access Controls: " + accessControls);
    }

    public void viewStudyGroups(int GroupID) {
        // Implementation to view study groups
    }

    public void getUserLog(int userID){
        
    }



}
