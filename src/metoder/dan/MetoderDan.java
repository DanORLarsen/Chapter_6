package metoder.dan;

import java.util.Scanner;

public class MetoderDan {
    public static int sumDigits(int n)
    {
        int per;
        int total = 0;
        while (n != 0){
            per = n%10;
            n /=10;
         total += per;
        }
        System.out.print("The total is: ");
        return total;
    }
    public static void count(int[] numbers){

        Scanner input = new Scanner(System.in);

        int num;

        do {
            num = input.nextInt();
            if (num >= 1 && num <= 100)
                numbers[num - 1]++;
        } while (num != 0);

    }

}

