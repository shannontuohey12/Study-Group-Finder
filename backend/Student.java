public class Student extends User {
    private String major;
    private int year;

    public Student(String name, int userID, String password, String role, String major, int year) {
        super(name, userID, password, role);
        this.major = major;
        this.year = year;
    }

    public String getMajor() {
        return major;
    }

    public int getYear() {
        return year;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
