import java.util.Scanner;
public class SeatTypeTest {
    public static void main(String[] args) {
        SeatType seatA = new SeatType( 750);
        SeatType seatB = new SeatType( 500);
        SeatType seatC = new SeatType( 250);

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the number of seats for seats A: ");
        int numberofA_seats = sc.nextInt();
        System.out.println(" Enter the number of seats for seats B: ");
        int numberofB_seats = sc.nextInt();
        System.out.println(" Enter the number of seats for seats C: ");
        int numberofC_seats = sc.nextInt();
        System.out.println(" Total Sale is = "+
                (seatA.getABC()*numberofA_seats+ seatB.getABC()
                        *numberofB_seats + seatC.getABC()*numberofC_seats));



    }

}
