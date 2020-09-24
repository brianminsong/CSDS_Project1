public class Runner {
    public static void main(String[] args) {
        //Creates a new CourseList instance
        CourseList list = new CourseList();

        //Inserting some things into the list so it is not empty.
        //I did it this way as it would be repetetive
        list.getListOfCourses()[0] = new Course("MATH223", "Calculus 3", 50);
        list.getListOfCourses()[1] = new Course("ASTR221", "Advanced Astronomy", 50);
        list.getListOfCourses()[2] = new Course("ENGR145", "Materials of Chemistry", 50);
        list.getListOfCourses()[3] = new Course("CSDS233", "Data Structures", 50);

        System.out.println(list);

        //Testing the addCourse() method
        list.addCourse(2, new Course("CSDS302", "Discrete Mathematics", 10));

        //Testing the removeCourse() function
        list.removeCourse(5);

        //Testing the changeCapacity() function
        list.changeCapacity("CSDS302", 10000);

        //Testing the other methods
        System.out.println(list.getCourseWithIndex(2));
        System.out.println(list.SearchCourseID("MATH223"));
        System.out.println(list.SearchCourseName("Materials of Chemistry"));
    }
}
