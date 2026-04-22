import java.util.List;

class Student extends User {
    private String major;

    public Student(String name, int userID, String password, String role, String major) {
        super(name, userID, password, role);
        this.major = major;
    }

    public Student(String name, int userID, String role, String major){
        super(name, userID, major, role);
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }


    public List<StudyGroup> getStudyGroups() {
        return List.of();
    }

    
    @Override
    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("User ID: " + getUserID());
        System.out.println("Role: " + getRole());
        System.out.println("Major: " + major);
    }


}
