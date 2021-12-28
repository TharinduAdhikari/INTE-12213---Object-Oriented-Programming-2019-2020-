import java.util.Scanner;

public class DemoCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter ending point :");
        int n = sc.nextInt();

        Counter c = new Counter();

        int i = 0;
        while (i<n){
            c.Increment();
            System.out.println(c.getValue());
            i++;
        }
    }
}
