public class CourseList {
    //The private field that has the array of Course objects
    private Course[] listOfCourses = new Course[10];

    //This method returns the number of Course objects in the listOfCourses array.
    //It does so by looping through the array and counting whenever the slot isnt null.
    public int size(){
        int size = 0;
        for(int i = 0; i < listOfCourses.length; i++){
            if(listOfCourses[i] != null){
                size++;
            }
        }
        return size;
    }

    //A getter and setter for the listOfCourses field since it is private.
    public Course[] getListOfCourses(){
        return listOfCourses;
    }
    public void setListOfCourses(Course[] listOfCourses){
        this.listOfCourses = listOfCourses;
    }

    //This method takes in an integer input and a course object
    //and inserts that object before that element in the list.
    //It also moves any elements on or after 1 spot.
    public void addCourse(int i, Course course){
        System.out.println("Operation: Add a course to index " + i + ".");
        System.out.println("Course: " + course.toString());
        System.out.println("List before the operation:");
        System.out.println(this);
        if(i > size()){
            getListOfCourses()[size()] = course;
        }
        else{
            for(int x = size(); x > i-1; x--){
                getListOfCourses()[x] = getListOfCourses()[x-1];
            }
            getListOfCourses()[i-1] = course;
        }
        System.out.println("List after the operation:");
        System.out.println(this);
    }

    //This method is used to remove a course in the list at an input position.
    public boolean removeCourse(int i){
        System.out.println("Operation: Remove a course at index " + i + ".");
        System.out.println("List before the operation:");
        System.out.println(this);
        if(i > size()){
            System.out.println("List after the operation:");
            System.out.println(this);
            return false;
        }
        getListOfCourses()[i-1] = null;

        //This loops through the entire list and looks for a position where there is a Course object
        for(int x = i-1; x < size(); x++){
            if(getListOfCourses()[x+1] != null){

                //This updates the list so there is no empty spaces in between
                getListOfCourses()[x] = getListOfCourses()[x+1];
                getListOfCourses()[x+1] = null;
            }
        }
        System.out.println("List after the operation:");
        System.out.println(this);
        return true;
    }

    //This simple method is used to change the capcicty of a course given its CourseID.
    public boolean changeCapacity(String courseID, int capacity){
        System.out.println("Operation: Change the capacity for the following courseID: " + courseID);
        System.out.println("Course: " + courseID + "\tChange capacity to: " + capacity);
        System.out.println("List before the operation:");
        System.out.println(this);

        //loops through to first find the course according to the courseID
        //Then once matched, will change the capacity with the integer input.
        for(int i = 0; i < size(); i++){
            if(getListOfCourses()[i].getCourseID() == courseID){
                getListOfCourses()[i].setCapacity(capacity);
                System.out.println("List after the operation:");
                System.out.println(this);
                return true;
            }
        }
        System.out.println("List after the operation:");
        System.out.println(this);
        return false;
    }

    //Used to find a course from its index on the list
    public Course getCourseWithIndex(int i){
        System.out.println("Operation: Return the course at index: "+ i);
        if(i > size()){
            return null;
        }
        return getListOfCourses()[i-1];
    }

    //Used to find a course from its CourseID
    public int SearchCourseID(String courseID){
        System.out.println("Operation: Return the index of a course from the following courseID: " + courseID);

        //this loops through each of the Course objects in the list and looks for the corresponding courseID
        for(int i = 0; i < size(); i++){
            if(getListOfCourses()[i].getCourseID() == courseID){
                System.out.print("Index of the course: ");
                return i+1;
            }
        }
        System.out.print("Index of the course: ");
        return -1;
    }

    //Used to find a course from its courseName
    public int SearchCourseName(String courseName){
        System.out.println("Operation: Return the index of a course from the following courseName: " + courseName);

        //this loops through each of the Course objects in the list and looks for the corresponding courseName
        for(int i = 0; i < size(); i++){
            if(getListOfCourses()[i].getCourseName() == courseName){
                System.out.print("Index of the course: ");
                return i+1;
            }
        }
        System.out.print("Index of the course: ");
        return -1;
    }

    //Simple tostring method that is used for printing the list of courses
    public String toString(){
        String list = "";
        for(int i = 0; i < size(); i++){
            list += (i+1) + ".\t" + getListOfCourses()[i].toString() + "\n";
        }
        return list;
    }
}
