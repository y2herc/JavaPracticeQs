public class convertInttoArray {
    public static int persistence(long n) {

        int result=0;

        while(n>9)
        {
            int sum=1;
            for (char t:String.valueOf(n).toCharArray())
            {
                sum=sum*Integer.parseInt(String.valueOf(t));
            }
            n=sum;
            result++;

        }
        return result;
    }
}
