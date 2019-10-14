public class FindPopulationGrowth {

    public static int nbYear(int p0, double percent, int aug, int p) {
        int total=  p0+(int)(((double) p0)*(percent/100)+aug);
        int years=1;
        while(total<p)
        {
            total=  (total+(int)((double)total*(percent/100)+aug));
            years++;
        }
        return years;
    }
}
