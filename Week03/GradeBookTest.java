public class GradeBookTest {
    public static void main(String[] args) {
        GradeBook gradeBook1 = new GradeBook("CS101 Introduction to Java Programming","Sam Smith");
        gradeBook1.displayMessage();
        System.out.println("\n\nChanging instructor nam to Judy Jones.\n");
        GradeBook gradeBook2 = new GradeBook("CS101 Introduction to Java Programming","Judy Jones");
        gradeBook2.displayMessage();
    }

}
