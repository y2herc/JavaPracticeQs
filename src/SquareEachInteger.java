public class SquareEachInteger {
    public static int squareDigits(int n) {

        String temp= String.valueOf(n);
        String result="";
        int size=temp.length();

        for(int i=0;i<size;i++){

            int j= Integer.parseInt(String.valueOf(temp.charAt(i)));
            j=j*j;
            result=result+String.valueOf(j);
        }

        return Integer.parseInt(result);


    }
}
