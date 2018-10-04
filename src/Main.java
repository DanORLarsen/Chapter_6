import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int lars = sc.nextInt();
        System.out.println(MetoderDan.sumDigits(lars));
    }
}
