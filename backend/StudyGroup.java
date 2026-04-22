public class StudyGroup {
    private int studyGroupID;
    private String courseName;
    private String meetingTime;
    
    public void displayInfo() {
        System.out.println("Study Group ID: " + studyGroupID);
        System.out.println("Course Name: " + courseName);
        System.out.println("Meeting Time: " + meetingTime);
    }

     public int getStudyGroupID() {
        return studyGroupID;
    }   

    public void setStudyGroupID(int studyGroupID) {
        this.studyGroupID = studyGroupID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getMeetingTime() {
        return meetingTime;
    }

    public void setMeetingTime(String meetingTime) {
        this.meetingTime = meetingTime;
    }


}
