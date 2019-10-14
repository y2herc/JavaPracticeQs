import java.util.ArrayList;

public class BusPassengers {
    public static int countPassengers(ArrayList<int[]> stops) {
        int onPass=0;
        int offPass=0;
        for(int[] i:stops){
            onPass+=i[0];
            offPass+=i[1];
        }
        int finalCount=onPass-offPass;
        if(finalCount!=0)
            return finalCount;
        else
            return 0;
    }
}
