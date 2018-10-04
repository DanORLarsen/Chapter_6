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

}
