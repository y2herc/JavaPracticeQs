import java.util.LinkedList;
import java.util.List;

public class SortOddNumbers {
    public static int[] sortArray(int[] array) {

        List<Integer> odds=new LinkedList<>();
        List<Integer> index=new LinkedList<>();

        for(int i=0;i<array.length;i++){
            if(array[i]%2==1){
                odds.add(array[i]);
                index.add(i);
            }
        }

        odds.sort(Integer::compareTo);

        for(int i=0;i<index.size();i++){

            array[index.get(i)]=odds.get(i);

        }

        return array;
    }
}
