public class GradeBook {

    private String courseName;
    private String courseInstructor ;

    public GradeBook(String name , String instructor) {
        courseName = name ;
        courseInstructor = instructor ;
    }

    public void setInstructor (String name) {
        courseInstructor = name;
    }

    public String getInstructor () {
        return courseInstructor ;
    }

    public void setCourseName (String name) {
        courseName = name ;
    }

    public String getCourseName() {
        return courseName ;
    }

    public void displayMessage() {
        System.out.printf("Welcome to the grade book for\n%s!\n",getCourseName());
        System.out.printf("This course is presented by : %s" , courseInstructor);

    }
}
