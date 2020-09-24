public class Course {
    //private fields with information about the course
    private String courseID;
    private String courseName;
    private int capacity;

    //simple constructor that takes 3 inputs corresponsing to courseID, courseName, and capacity
    public Course(String courseID, String courseName, int capacity){
        this.courseID = courseID;
        this.courseName = courseName;
        this.capacity = capacity;
    }

    //setter and getter methods for the courseID
    public void setCourseID(String courseID){
        this.courseID = courseID;
    }
    public String getCourseID(){
        return courseID;
    }

    //setter and getter methods for courseName
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    public String getCourseName(){
        return courseName;
    }

    //simple setter and gettter for capacity of the course
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    public int getCapacity(){
        return capacity;
    }

    //Simple tostring that is used for printing information about the course.
    //Formats information in  a neat matter.
    public String toString(){
        return "courseID: " + getCourseID() + ", courseName: " + getCourseName() + ", capacity: " + getCapacity();
    }
}
