import com.sun.org.apache.xpath.internal.operations.Bool;

public class Main {

    public static void main(String[] args) {

        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByName("JavaScript");
        String foo = "40+2";
        System.out.println(engine.eval(foo));
    }

    public static String spinWords(String sentence) {
        String result="";
        String[] temp;

        temp=sentence.split(" ");

        for(int i=0;i<temp.length;i++)
        {
            if (temp[i].length()<=4)
                result+=temp[i]+" ";
            else
            {
                result+=reverse(temp[i])+" ";
            }
        }

        return result.substring(0,result.length()-1);
    }
    public static String reverse(String input){
        String temp="";

        for(int i=(input.length()-1);i>=0;i--)
        {
            temp+=String.valueOf(input.charAt(i));
        }

        return temp;
    }
}