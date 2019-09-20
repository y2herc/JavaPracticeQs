public class BuildingPile {
    public static long findNb(long m) {

        int mm = 0;
        int n = 0;

        while (mm < m) {
            n++;
            mm = mm + (n * n * n);
        }
        if (mm == m)
            return n;
        else
            return -1;

    }
}
