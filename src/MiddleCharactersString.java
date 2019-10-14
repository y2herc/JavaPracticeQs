public class MiddleCharactersString {
    public static String getMiddle(String word){

        int size=word.length();
        int mid=size/2;
        if(size%2==0)
            return word.substring(mid-1,mid+1);

        else {
            return String.valueOf(word.charAt(mid));
        }

    }
}
