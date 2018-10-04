public class MetoderDan {
    public static int sumDigits(int n)
    {
        int per;
        int total = 0;
        while (n != 0){
            per = n%10;
            n = (n/10);
         total += per;
            System.out.println(total);
        }
        return total;
    }

}
