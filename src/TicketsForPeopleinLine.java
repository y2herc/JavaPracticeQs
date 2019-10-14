public class TicketsForPeopleinLine {
    public static String Tickets(int[] peopleInLine)
    {
        int bills25=0;
        int bills50=0;

        for (int payment:peopleInLine){

            if(payment==25){
                bills25++;
            }
            else if(payment==50){
                bills50++;
                bills25--;
            }
            else if(payment==100)
            {
                if(bills50>0)
                {
                    bills50--;
                    bills25--;
                }
                else
                    bills25-=3;
            }
            if(bills25<0||bills50<0)
                return "NO";
        }
        return "YES";
    }
}
